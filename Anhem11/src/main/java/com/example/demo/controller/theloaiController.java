package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.dao.theloaidao;
import com.example.demo.entity.theloaientity;
import com.example.demo.service.theloaiservice;


@Controller
public class theloaiController {
	@Autowired
	theloaidao tldao;
	@Autowired
	theloaiservice TLService;
	@GetMapping("/theloai")
	public String gettheloai(Model model)
	{
		
		theloaientity TLEntity= new theloaientity();
		
		model.addAttribute("TLEntity",TLEntity);
		// findall là chuỗi dữ liệu sql 
		// mà dao là lớp giao tiếp với SQL nên tldao.findall
		// khởi tạo một mảng tạo đặt tên là list
		
		
		List<theloaientity> list = TLService.findAll();
		//model là một biến tương tác với view 
		model.addAttribute("model",list);
		System.out.println(list);
		return "admin/theloai";
	}
	@GetMapping("/theloai/edit/{id}")
	public String edittl (Model model, @PathVariable("id") int id)
	{
		model.addAttribute("TLEntity",TLService.findById(id));
		
		List<theloaientity> list = TLService.findAll();
		model.addAttribute("model",list);
		return "admin/theloai";
	}
	@GetMapping("/theloai/delete/{id}")
	public String deletetl(Model model, @PathVariable("id") int id)
	{
		
		TLService.delete(id);
		return "redirect:/theloai";
	}
	@PostMapping("/theloai/create")
	public String createtl( @ModelAttribute("TLEntity")theloaientity TLEntity, Model model)
	{
		TLService.create(TLEntity);
		return "redirect:/theloai";
	}
}
