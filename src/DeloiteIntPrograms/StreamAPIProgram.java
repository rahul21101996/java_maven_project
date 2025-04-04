package DeloiteIntPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIProgram {

	public static void main(String []args) {
		
	List<Employee> empList=new ArrayList<Employee>();
	
	empList.add(new Employee(1, 500));
	empList.add(new Employee(2, 1000));
	empList.add(new Employee(3, 1500));
	empList.add(new Employee(4, 2000));
	empList.add(new Employee(5, 2500));
	empList.add(new Employee(6, 3000));
	empList.add(new Employee(7, 3500));
	
	// Sorted salary as descending order 
	List<Employee> sortList=empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())) //sort employees in descending order
			.limit(3) //using limmit getting top 3 salaried employees
			//.skip(3) //to fetch all employees having salary less than 3rd highest salary
			.collect(Collectors.toList());
	System.out.println(sortList);
	
}
}
