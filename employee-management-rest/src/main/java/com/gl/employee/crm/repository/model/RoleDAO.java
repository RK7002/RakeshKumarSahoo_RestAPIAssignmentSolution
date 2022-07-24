package com.gl.employee.crm.repository.model;

import java.util.List;

import com.gl.employee.crm.entity.Role;

public interface RoleDAO {
	
	public List<Role> getRoles();
	public String addRole(Role role);
	
}
