package com.model;

public class EmployeeModel {

	private String fastName;
	private String lastName;
	private String Email;
	private String telephone;
	private String password;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFastName() {
		return fastName;
	}

	public void setFastName(String fastName) {
		this.fastName = fastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeModel(String fastName, String lastName, String email, String telephone, String password, int age) {
		super();
		this.fastName = fastName;
		this.lastName = lastName;
		Email = email;
		this.telephone = telephone;
		this.password = password;
		this.age = age;
	}

	public EmployeeModel() {
		super();
	}
}
