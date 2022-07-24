package com.gl.employee.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.employee.crm.entity.User;
import com.gl.employee.crm.repository.model.UserRepository;
import com.gl.employee.crm.security.config.MyUserDetails;

public class UserDetailsServiceImplementation implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException,NullPointerException,ArrayIndexOutOfBoundsException {
		User user= userRepository.getUserByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("User Record Not Found .");
		}
		return new MyUserDetails(user);
	}

}
