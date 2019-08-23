package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class userDaoService {
	
	private static List<User> users=new ArrayList<>();
	
	private static int count=0;
	
	static{
		
		users.add(new User(1,"om",new Date()));
		users.add(new User(2,"Prem",new Date()));
		
	}

	
	public List<User> fetchAll()
	{
		return users;
	}
	
	public User save(User user)
	{
		if(user.getId()==null)
		{
			user.setId(++count);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		 for (User user : users) {
		 if (user.getId() == id) {
		 return user;
		 }
		 }
		 return null;
		 }
	
	public User deleteById(int id) {
		 Iterator<User> iterator = users.iterator();
		 while (iterator.hasNext()) {
		 User user =
		 iterator.next();
		 if (user.getId() == id) {
		 iterator.remove();
		 return user;
		 }
		 }
		 return null;
		 }


}
