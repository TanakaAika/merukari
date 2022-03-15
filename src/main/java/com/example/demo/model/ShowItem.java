package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ShowItem {
	@Autowired
	ItemRepository itemRepository;
	
	public void getItem(ModelAndView mv) {
		List<Item> itemList = itemRepository.findAll();
		mv.addObject("items",itemList);
	}
}
