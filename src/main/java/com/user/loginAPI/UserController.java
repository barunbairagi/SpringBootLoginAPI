package com.user.loginAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class UserController {
	
	    @Autowired
		private UserService userService;
	    
	    @Autowired
	    private BookingService bookingService;
		
		// Write the REST End point for all the methods present in Service
		@PostMapping("/addUser")
		public User addUser(@RequestBody User user){
			
			return userService.saveUser(user);
		 
		}
		
		@PostMapping("/addUsers")
		public List<User> addUsers(@RequestBody List<User> users){
			
			return userService.saveUsers(users);
		 
		}
		@RequestMapping("/hello")
		public String welcome(){
			
			return "Welcome to the world of SpringBoot rest Service";
				
		}
		
		@GetMapping("/users")
		public List<User> findAllUsers(){
			
			return userService.getUsers();
				
		}
		@GetMapping("/userById/{id}")
		public User findUserById(@PathVariable int id){
			
			return userService.getuserById(id);
				
		}
		@GetMapping("/userByName/{userName}")
		public User findUserByName(@PathVariable String userName){
			
			return userService.getUserByName(userName);
				
		}
		@GetMapping("/logIn/{userName, password}")
		public Boolean logIn(@PathVariable String userName, @PathVariable String password ){
			
			User user =  userService.getUserByName(userName);
			if(user.getUserName() == userName && user.getPassWord()==password)
			 return true;
			else
			return false;
	     }
	    @DeleteMapping("/removeUser/{id}")
		public String removeUser(@PathVariable int id){
			
			 userService.deleteUser(id);
			 return "removed Product.."+ id;
		 
		}
		
		@PutMapping("/update")
		public User updateUser(@RequestBody User user){
			
			return userService.updateUser(user);
			
		 
		}
		@PostMapping("/booking")
		public Booking addBooking(@RequestBody Booking booking){
			
			return bookingService.saveBooking(booking);
		 
		}

}
