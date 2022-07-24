package com.gl.employee.crm.repository.model;

import java.util.List;

import com.gl.employee.crm.entity.User;

public interface UserAndRolesDAO {

	public List<User> getUsers();

	public String saveUser(User user);

}
