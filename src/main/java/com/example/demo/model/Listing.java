package com.example.demo.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Category;
import com.example.demo.entity.Item;
import com.example.demo.entity.User;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemRepository;

@Service
public class Listing {
	@Autowired
	HttpSession session;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ItemRepository itemRepository;
	
	public void getCategory(ModelAndView mv) {
		List<Category> categoryList = categoryRepository.findAll();
		mv.addObject("categories",categoryList);
	}
	
	public void listing(String name, int price, String introduction, String[] categories, ModelAndView mv) {
		String categoryId = "";
		int count = 1;
		for(String category:categories) {
			categoryId += category;
			if(count == categories.length) {
				break;
			}
			categoryId += ",";
			count ++;
		}
		Date listingDate = Date.valueOf(LocalDate.now());
		int listingUserId = ((User)session.getAttribute("loginUser")).getId();
		itemRepository.save(new Item(name, price, introduction, categoryId, listingDate, listingUserId));
	}

}
