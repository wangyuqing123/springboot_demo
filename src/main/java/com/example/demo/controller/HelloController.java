package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@Controller
public class HelloController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/hello")
    public ModelAndView test(){
		ModelAndView mv=new ModelAndView();
		List<User> aa = new ArrayList<>();
		try {
			aa = userService.hello();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.setViewName("view");
		mv.addObject("person", aa.get(0));
        return mv;  
    }
}
