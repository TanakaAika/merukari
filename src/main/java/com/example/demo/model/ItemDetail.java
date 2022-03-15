package com.example.demo.model;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Item;
import com.example.demo.entity.User;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.UserRepository;

@Service
public class ItemDetail {
	@Autowired
	HttpSession session;
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	CategoryRepository categoryRepository;
	
	public void getItem(int id, ModelAndView mv) {
		Item item = itemRepository.findById(id);
		String listingUserNickname = userRepository.findById(item.getListingUserId()).getNickname();
		String[] categories = item.getCategoryId().split(",");
		int arrayCount = 0;
		for(String categoryId:categories) {
			categories[arrayCount] = (categoryRepository.findById(Integer.parseInt(categoryId))).getName();
			arrayCount++;
		}
		if(((User)session.getAttribute("loginUser")).getId() != item.getListingUserId()) {
			item = countAccess(item);
		}
		mv.addObject("item",item);
		mv.addObject("listingUserNickname",listingUserNickname);
		mv.addObject("categories", categories);
	}
	
	public Item countAccess(Item item) {
		itemRepository.save(
				new Item(item.getId(), item.getName(), item.getPrice(), item.getImage(),
					item.getIntroduction(), item.getCategoryId(), item.getListingDate(),
					item.getListingUserId(), item.getAccess()+1, item.getPurchaseUserId(),
					item.getPurchaseDate(), item.getPaymentMethod(), item.getAddress(),
					item.getPaymentDeadline(), item.getPaymentCompletionDate(),
					item.getSendDeadline(), item.getSendCompletionDate()
				)
		);
		item = itemRepository.findById(item.getId());
		return item;
	}

}
