package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Listing;

@Controller
public class ListingController {
	@Autowired
	Listing listing;
	
	@RequestMapping("/listingTransition")
	public ModelAndView listingTransition(ModelAndView mv) {
		listing.getCategory(mv);
		mv.setViewName("listing");
		return mv;
	}
	
	@RequestMapping("/listing")
	public ModelAndView listing(
			@RequestParam(name="name") String name,
			@RequestParam(name="price") int price,
			@RequestParam(name="introduction") String introduction,
			@RequestParam(name="categoryies") String[] categoryies,
			ModelAndView mv) {
		listing.listing(name, price, introduction, categoryies, mv);
		mv.setViewName("my_page");
		return mv;
	}

}
