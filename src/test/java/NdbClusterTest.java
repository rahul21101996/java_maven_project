
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class NdbClusterTest {

    // Configuration for Node 1
    private JdbcTemplate getNode1JdbcTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://10.2.10.182:3306/Test_1");
        dataSource.setUsername("writer");
        dataSource.setPassword("writer#123");
        return new JdbcTemplate(dataSource);
    }

    // Configuration for Node 2
    private JdbcTemplate getNode2JdbcTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://10.2.10.181:3306/Test_1");
        dataSource.setUsername("writer");
        dataSource.setPassword("writer#123");
        return new JdbcTemplate(dataSource);
    }

    @Test
    public void testSimultaneousInsert() {
        JdbcTemplate node1JdbcTemplate = getNode1JdbcTemplate();
        JdbcTemplate node2JdbcTemplate = getNode2JdbcTemplate();

        // Define the number of records to insert
        final int numberOfRecords = 1000;  // Make the variable final

        // Fixed thread pool for simultaneous execution
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Task for Node 1
        Runnable taskNode1 = () -> {
            for (int i = 1; i <= numberOfRecords; i++) {
                String sql = "INSERT INTO User (Name, Email, Password) VALUES (?, ?, ?)";
                node1JdbcTemplate.update(sql, "User" + i, "user" + i + "@example.com", "password123");
            }
        };

        // Task for Node 2
        Runnable taskNode2 = () -> {
            for (int i = 1; i <= numberOfRecords; i++) {
                String sql = "INSERT INTO User (Name, Email, Password) VALUES (?, ?, ?)";
                node2JdbcTemplate.update(sql, "User" + i, "user" + i + "@example.com", "password123");
            }
        };

        // Execute tasks simultaneously
        assertDoesNotThrow(() -> {
            executorService.submit(taskNode1);
            executorService.submit(taskNode2);

            // Shutdown executor service after completion
            executorService.shutdown();
            while (!executorService.isTerminated()) {
                Thread.sleep(100); // Wait for tasks to complete
            }
        });

        System.out.println("Data insertion completed on both nodes.");
    }

}
