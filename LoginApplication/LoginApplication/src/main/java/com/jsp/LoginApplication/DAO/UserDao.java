package com.jsp.LoginApplication.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.LoginApplication.DTO.User;
import com.jsp.LoginApplication.Repository.LoginRepository;

@Repository
public class UserDao {
	
	@Autowired
	LoginRepository repository;
	
	//to insert User Object
	public String saveUser(User user)
	{
		repository.save(user);
		return "User registerd successfully";
	}
	
	//validating user for login
	public String loginValidateUser(String username, String password)
	{
		
		User u = repository.validateUser(username, password);
		if(u != null)
		{
			return "Login successfull";
		}
		return "Incorrect Username & Password";
		
	}
}
