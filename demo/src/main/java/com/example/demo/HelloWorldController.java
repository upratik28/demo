package com.example.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private userDaoService service;
	
	@GetMapping(path="/hello")
	public String helloWorld()
	{
		return "hello Paaji";
	}
	@GetMapping(path="/helloWorld")
	public HelloWorldBean helloWorlds()
	{
		return new HelloWorldBean("hello Paaji changa");
	}
	
	@GetMapping(path="/helloWorldPathVariable/{name}")
	public HelloWorldBean helloWorldsPath(@PathVariable String name)
	{
		return new HelloWorldBean("hello Paaji changa :"+ name);
	}
	
	@GetMapping("/fetchList")
	public List<User> fetchAll()
	{
		return service.fetchAll();
	}
	
	@GetMapping("/fetchUnique/{id}")
	public User fetchOne(@PathVariable int id)
	{
		User response=service.findOne(id);
		
		if(response==null)
			throw new UserNotFoundException("id -"+id);
		return response;
	}
	
	@PostMapping("/users")
	 public void createUser(@Valid @RequestBody User user){
	 User savedUser = service.save(user);
	 } 
	
	
	 @DeleteMapping("/users/{id}")
	 public void deleteUser(@PathVariable int id) {
	 User user = service.deleteById(id);

	 if(user==null)
	 throw new UserNotFoundException("id-"+ id);
	 }
}
