package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Signup;

@Controller
public class SignupController {
	@Autowired
	Signup signup;
	
	@RequestMapping("/signupTransition")
	public String signupTransition() {
		return "signup";
	}
	
	@RequestMapping("/signup")
	public ModelAndView signup(
		@RequestParam(name="name") String name,
		@RequestParam(name="nickname") String nickname,
		@RequestParam(name="password") String password,
		@RequestParam(name="mailAddress") String mailAddress,
		@RequestParam(name="phoneNumber") String phoneNumber,
		@RequestParam(name="year") String year,
		@RequestParam(name="month") String month,
		@RequestParam(name="day") String day,
		ModelAndView mv
	) {
		signup.signup(nickname, name, password, mailAddress, phoneNumber, (year+"-"+month+"-"+day));
		
		mv.setViewName("login");
		return mv;
	}
}
