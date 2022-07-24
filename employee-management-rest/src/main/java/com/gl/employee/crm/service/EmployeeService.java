package com.gl.employee.crm.service;

import java.util.List;

import com.gl.employee.crm.entity.Employee;
import com.gl.employee.crm.entity.Role;
import com.gl.employee.crm.entity.User;

public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(int id);

	public void save(Employee employee);

	public void delete(int id);

	public List<Employee> findByFirstName(String firstName);
	
	public List<Employee> sortByFirstName(String order);
	
	public String addRole(Role role);
	
	public String saveUser(User user);
	
	public List<Role> getRoles();
	
	public List<User> getUsers();
}
