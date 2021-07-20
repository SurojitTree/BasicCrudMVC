package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.EmployeeModel;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<EmployeeModel> getEmployees() {
		// TODO Auto-generated method stub
		String sql = "select * from employee";
		List<EmployeeModel> lt = template.query(sql, new RowMapper<EmployeeModel>() {
			public EmployeeModel mapRow(ResultSet rs, int arg1) throws SQLException {
				EmployeeModel emp = new EmployeeModel();

				emp.setFastName(rs.getString(1));
				emp.setLastName(rs.getString(2));
				emp.setPassword(rs.getString(3));
				emp.setTelephone(rs.getString(4));
				emp.setAge(rs.getInt(5));
				emp.setEmail(rs.getString(6));
				return emp;
			}
		});
		return lt;
	}

	public int insert(EmployeeModel emp) {
		// TODO Auto-generated method stub
		String sql = "insert into employee (fName,lName,password,telephone,age,email) values ('" + emp.getFastName()
				+ "','" + emp.getLastName() + "','" + emp.getPassword() + "','" + emp.getTelephone() + "',"
				+ emp.getAge() + ",'" + emp.getEmail() + "')";

		return template.update(sql);
	}

	public void delete(String email) {
		String sql = " delete from employee where email = '" + email + "'";
		template.update(sql);
	}

	public void save(EmployeeModel emp) {
		// TODO Auto-generated method stub

		String sql = "update  employee set fName='" + emp.getFastName() + "',lName='" + emp.getLastName()
				+ "',password='" + emp.getPassword() + "',telephone='" + emp.getTelephone() + "',age=" + emp.getAge()
				+ " where email = '" + emp.getEmail() + "'";
		template.update(sql);
	}

}
