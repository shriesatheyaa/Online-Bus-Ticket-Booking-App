package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import exception.DatabaseException;
import service.UserService;
import model.User;

@Controller
public class ApplicationController {
	
	 
	 @Autowired
	 private UserService userService;
	 
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	 public ModelAndView saveUser(@ModelAttribute("command")User user,BindingResult result) {
	     try {
		     userService.addUser(user);
	     } catch (DatabaseException e) {
	    	  e.printStackTrace();
	     }
	     return new ModelAndView("redirect:/login.jsp");
	}
}
