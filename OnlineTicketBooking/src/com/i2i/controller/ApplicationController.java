package com.i2i.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.i2i.exception.DatabaseException;
import com.i2i.model.Route;
import com.i2i.model.TripRoute;
import com.i2i.model.User;
import com.i2i.service.RouteService;
import com.i2i.service.TripRouteService;
import com.i2i.service.UserService;
@Controller
public class ApplicationController {
    @Autowired   
    UserService userService;
    @Autowired   
    RouteService routeService;
    @Autowired
    TripRouteService tripRouteService;
    @RequestMapping(value = "/HomePage")
    public ModelAndView getHomePage() {
        return new ModelAndView("HomePage");
    }
    
    @RequestMapping(value = "/registerPage")
    public ModelAndView getRegisterForm() {
        return new ModelAndView("RegisterPage");
    }
     
    @RequestMapping(value = "/loginPage")
    public ModelAndView getLoginForm() {
        return new ModelAndView("LoginPage");

    }
   
   @RequestMapping("/saveUser")
    public ModelAndView saveUserData(@ModelAttribute("user") User user, BindingResult result) {
        System.out.println("Save User Data");
        System.out.println(userService);
        System.out.println(user);
        userService.addUser(user);
        return new ModelAndView("LoginPage");
        //return new ModelAndView("redirect:/Response.html");
    }
   
   @RequestMapping("/authenticate")
   public ModelAndView authenticateUser(@ModelAttribute("user") User user, BindingResult result) {
       System.out.println("Authenticate");
       System.out.println(userService);
       System.out.println(user);
       boolean isValid = userService.isValid(user.getEmail(), user.getPassword());
       if (isValid){
           return new ModelAndView("SearchBus");
       } else {
    	   return new ModelAndView("LoginPage");
       }
       //return new ModelAndView("redirect:/Response.html");
   }
   
   @RequestMapping(value = "/SearchBus")
   public ModelAndView getSearchForm() {
       /*Map<String, Object> model = new HashMap<String, Object>();
       model.put("user", user);
       System.out.println(user.getName());*/
       return new ModelAndView("SearchBus");
       
   }
   @RequestMapping(value = "/Search",method = RequestMethod.POST)
   public ModelAndView test(@RequestParam("source") String source,@RequestParam("destination") String destination,@RequestParam("date") String date) {
       /*Map<String, Object> model = new HashMap<String, Object>();
       model.put("user", user);
       System.out.println(user.getName());*/
       System.out.println(source);
       System.out.println(destination);
       System.out.println(date);
       List<Route> routes = null;
       try {
           routes = routeService.getRoute(source, destination);
       } catch (DatabaseException e) {
    	   e.printStackTrace();
       }
       System.out.println(routes);

       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       Date TravelDate =null;
       try {
           TravelDate = df.parse(date);
           System.out.println("dateOfTravel:"+TravelDate);
       } catch (ParseException e) {
           e.printStackTrace();
       }
       java.sql.Date dateOfTravel = new java.sql.Date(TravelDate.getTime());
       System.out.println("sqlDate:"+dateOfTravel);
       List<TripRoute> tripRoutes = null;
       for (Route route : routes) {
           try {
        	   tripRoutes = tripRouteService.getTripRoutes(route, dateOfTravel);
           } catch (DatabaseException e) {
    	       e.printStackTrace();
           }
       }
       System.out.println(tripRoutes);
      
       return new ModelAndView("SearchBus");
          
   }   
}
   
