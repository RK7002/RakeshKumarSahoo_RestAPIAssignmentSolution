package com.gl.employee.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.employee.crm.entity.Employee;
import com.gl.employee.crm.entity.Role;
import com.gl.employee.crm.entity.User;
import com.gl.employee.crm.repository.model.EmployeeDAO;
import com.gl.employee.crm.repository.model.RoleDAO;
import com.gl.employee.crm.repository.model.UserAndRolesDAO;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private UserAndRolesDAO userAndRolesDAO;
	@Autowired
	private RoleDAO roleDAO;

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Override
	public void delete(int id) {
		employeeDAO.delete(id);
	}

	@Override
	public List<Employee> findByFirstName(String firstName) {
		return employeeDAO.findByFirstName(firstName);
	}

	@Override
	public List<Employee> sortByFirstName(String order) {
		return employeeDAO.sortByFirstName(order);
	}

	@Override
	public String addRole(Role role) {
		return roleDAO.addRole(role);
	}

	@Override
	public String saveUser(User user) {
		return userAndRolesDAO.saveUser(user);
	}

	@Override
	public List<Role> getRoles() {
		return roleDAO.getRoles();
	}

	@Override
	public List<User> getUsers() {
		return userAndRolesDAO.getUsers();
	}

}
