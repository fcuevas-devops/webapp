package com.fcuevas.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("home")
	//public ModelAndView home(@RequestParam("name") String myName, HttpSession session) {
	public ModelAndView home(Alien alien) {	
		
		System.out.println("Hola"); 
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		
		return mv;
	}
	
}
