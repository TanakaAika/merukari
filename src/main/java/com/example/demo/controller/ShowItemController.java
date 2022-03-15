package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ShowItem;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.UserRepository;

@Controller
public class ShowItemController {
	@Autowired
	HttpSession session;
	@Autowired
	ShowItem showItem;
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		showItem.getItem(mv);
		mv.setViewName("show_item");
		return mv;
	}
	
	@RequestMapping("/loginMessage")
	public ModelAndView loginMessage(ModelAndView mv) {
		mv.addObject("message", "商品の詳細を確認するにはログインが必要です");
		showItem.getItem(mv);
		mv.setViewName("show_item");
		return mv;
	}
}
