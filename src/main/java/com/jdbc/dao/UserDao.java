package com.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbc.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveUser(User user) {
		String sql = "Insert into User(Name,Email,Password) values(?,?,?)";
		int i = jdbcTemplate.update(sql, user.getFullName(), user.getEmail(), user.getPassword());
		return i;
	}
	
	
	public int updateDetails(User user) {
		String sql = "update User set Name=? ,Email=?, Password=? where Id=?";
		int i = jdbcTemplate.update(sql, user.getFullName(), user.getEmail(), user.getPassword(), user.getId());
		return i;
	}

	public int delete(int id) {
		String sql = "delete from User where Id=?";
		int i = jdbcTemplate.update(sql, id);
		return i;
	}
	
	
	public List<User> getAllUser() {
		String sql = "select * from User";
		RowMapper rowMapper = new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				User user = new User();
				user.setId(rs.getInt(1));
				user.setFullName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(4));
				
				return user;
			}

		};
		List<User> list = jdbcTemplate.query(sql, rowMapper);

		return list;
	}
	
	
	public User getUserById(int id) {
		String sql = "select * from User where Id=?";
		RowMapper rowMapper = new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

			    User user = new User();
				user.setId(rs.getInt(1));
				user.setFullName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(4));
				return user;
			}

		};

		User user = jdbcTemplate.queryForObject(sql, rowMapper, id);

		return user;
	}


}
