package com.yueyuehe.develop.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yueyuehe.develop.system.domain.User;
import com.yueyuehe.develop.system.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService service;
	
	@RequestMapping("/del")
	private String delUser(@RequestParam("id") Long id ){
		service.deleteById(id);
		return "redirect:/user/list";
	}
	
	@RequestMapping("/toAdd")
	private String toAddUI(){
		return "user/addUI";
	}
	
	@RequestMapping("/toEdit")
	private String toEditUI(@RequestParam("id") Long id,Model model){
		User user = service.findById(id);
		model.addAttribute(user);
		return "user/editUI";
	}
	
	@RequestMapping("/add")
	private String saveUser(User user){
		
		service.insert(user);
		return "redirect:/user/list";
	}
	
	@RequestMapping("/edit")
	private String editUser(User user){
		service.update(user);
		return "redirect:/user/list";
	}
	
	@RequestMapping("/list")
	private String list(Model model){
		List<User> list = service.findAll();
		model.addAttribute(list);
		return "user/list";
	}
	
	
}
