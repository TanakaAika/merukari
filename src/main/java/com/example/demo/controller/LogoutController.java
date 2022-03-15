package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
	@Autowired
	HttpSession session;
	
	@RequestMapping("/logout")
	public ModelAndView logout(ModelAndView mv) {
		session.invalidate();
		mv.setViewName("show_item");
		return mv;
	}
}
