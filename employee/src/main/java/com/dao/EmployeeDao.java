package com.dao;

import java.util.List;

import com.model.EmployeeModel;

public interface EmployeeDao  {

	List<EmployeeModel> getEmployees();

	int insert(EmployeeModel emp);

	void delete(String email);

	public void save(EmployeeModel emp);

}
