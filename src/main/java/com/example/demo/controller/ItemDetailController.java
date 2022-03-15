package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ItemDetail;

@Controller
public class ItemDetailController {
	@Autowired
	ItemDetail itemDetail;
	
	@RequestMapping("/itemDetailTransition")
	public ModelAndView itemDetailTransition(
		@RequestParam(name="itemId") int itemId,
		ModelAndView mv
	) {
		itemDetail.getItem(itemId,mv);
		mv.setViewName("item_detail");
		return mv;
	}
}
