package com.org.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.hibernate.pojo.User;

@Controller
public class UserContoller {
	@RequestMapping("/userregistrationform") 
	public ModelAndView showRegistrationForm(){  
        //command is a reserved request attribute name, now use <form> tag to show object data  
       return new ModelAndView("registration","command",new User());  
    }  
	
	/*u.setUserId("Pratik123");
	u.setFirstName("Pratik");
	u.setLastName("Sharma");
	u.setMobileNumber(new Integer(930892043));
	u.setGender('M');
	u.setPassword("Pass@123");
	ud.addUser(u);*/
	
	@RequestMapping(value="/saveregistration",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") User user){  
        //write code to save emp object  
        //here, we are displaying emp object to prove emp has data  
        System.out.println(user.getUserId()+" "+user.getFirstName()+" "+user.getLastName()+" "+user.getMobileNumber()+" "+user.getGender());  
          
        //return new ModelAndView("empform","command",emp);//will display object data  
        //return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
        return new ModelAndView("registration","command",new User());  
    }  
}
