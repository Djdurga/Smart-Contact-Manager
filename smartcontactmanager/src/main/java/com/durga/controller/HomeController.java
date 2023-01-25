package com.durga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.durga.dao.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Smart Contact Manager");
		return "about";
	}

	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Register - Smart Contact Manager");
		model.addAttribute("user", new User());
		return "signup";
	}

	// handler for registering user

	
	  @RequestMapping(value = "/do_register",method = RequestMethod.POST) public
	  String registerUser(@ModelAttribute("user")User user,@RequestParam(value=
	  "agreement", defaultValue = "false")boolean agreement, Model model) {
	  
	  if(!agreement) {
	  System.out.println("You have not agreed the terms and conditions"); 
	  }
	 
	  
	  
	  
	  System.out.println("Agreement " +agreement); 
	  System.out.println("USER "+user);
	  
	
	  model.addAttribute("user", user);
	  
	 
	  
	  return "signup"; 
	  }
	 
}
