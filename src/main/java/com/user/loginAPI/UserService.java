package com.user.loginAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public List<User> saveUsers(List<User> users) {
		return userRepository.saveAll(users);
	
	}
	
	public List<User> getUsers(){
		
	  return userRepository.findAll();
	}
	
	public User getuserById(int Id){
		
		  return userRepository.findById(Id).orElse(null);
	}
	
	public User getUserByName(String userName) {
		
		return userRepository.findByUserName(userName).orElse(null);
	}
	
	// Methods for DELETE below
		public String deleteUser(int id) {
			
			userRepository.deleteById(id);
			return "Successfully deleted"+id;
		}
	// Methods for PUT (Update) below
		public User updateUser(User user) {
			
			User existingUser = userRepository.findById(user.getId()).orElse(null);
			
			existingUser.setUserName(user.getUserName());
			existingUser.setPassWord(user.getPassWord());
			
			return userRepository.save(existingUser);
			
		}

	}
