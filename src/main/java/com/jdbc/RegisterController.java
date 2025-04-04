package com.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jdbc.entity.User;
import com.jdbc.service.UserService;

@Controller
@RequestMapping("demo")
public class RegisterController {
	
	@Autowired
	private UserService UserService;

	@GetMapping("/register")
	public String signup() {
		return "register";
	}

	
	  @PostMapping("/createUser") 
	  public String registerUser(@ModelAttribute User user) {
	  
	  UserService.registerUser(user);
	  
	  return "success";
	  }
	  
	  @GetMapping("/users")
	    public String listUsers(Model model) {
	        List<User> users = UserService.getAllUsers();
	        model.addAttribute("users", users);
	        return "userList";  
	    }
	  
	  @GetMapping("/updateUser/{id}")
	    public String showUpdateForm(@PathVariable int id, Model model) {
	        User user = UserService.getUserById(id); 
	        model.addAttribute("user", user);        
	        return "update";                        
	    }
	  
	  
	  @PostMapping("/editUser")
	    public String updateUser(@ModelAttribute User user) {
	        UserService.updateUserDetails(user);
	        return "redirect:/demo/users"; 
	    }
	 
	  
	  @PostMapping("/deleteUser")
	    public String deleteUser(@RequestParam int id) {
	        UserService.deleteUserById(id);
	        return "redirect:/demo/users"; 
	    }
	 

}
