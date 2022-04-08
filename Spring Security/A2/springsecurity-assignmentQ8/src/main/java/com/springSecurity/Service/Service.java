package com.springSecurity.Service;

import java.util.ArrayList;
import java.util.List;

import com.springSecurity.Model.User;

@org.springframework.stereotype.Service
public class Service {
	List<User>list=new ArrayList<>();
	public Service()
	{
		list.add(new User("Rohan","romi","mitrarohan2001@gmail.com"));
		list.add(new User("Abhishek","Abkar","shekkar69@gmail.com"));
	
	}
	public List<User>findall()
	{
		return list;
	}
	public User findByUsername(String username)
	{
		return list.stream().filter(a->a.getUsername().equals(username)).findFirst().get();
	}
	
	public User add(User user)
	{
		
		list.add(user);
		return user;
	}

}
