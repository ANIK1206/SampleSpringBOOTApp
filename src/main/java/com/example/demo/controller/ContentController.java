package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.service.ContentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ContentController {
	//Put your code here.	
	@Autowired
	private ContentService contentService; 
	
	@GetMapping("/")
	public List<Category> getListofContents() {			
		return contentService.getAllContent();
	}
	
}