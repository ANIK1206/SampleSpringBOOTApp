package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Course;

@Service
public class ContentService {
    //put your code here.	
	public List<Category> getAllContent(){
		
		List<Course> courses1 = new ArrayList<>();
		courses1.add(new Course(2001, "AWS essentials", 180, 100, 1001));
		courses1.add(new Course(2002, "Azure essentials", 200, 200, 1001));
		courses1.add(new Course(2003, "Google CLoud essentials", 200, 200, 1001));
		
		List<Course> courses2 = new ArrayList<>();
		courses2.add(new Course(3001, "Powershell", 200, 200, 1002));
		courses2.add(new Course(3002, "Maven", 200, 200, 1002));
		courses2.add(new Course(3003, "Kubernetes", 200, 200, 1002));
		
		List<Course> courses3 = new ArrayList<>();
		courses3.add(new Course(4001, "Bootstrap", 200, 200, 1003));
		courses3.add(new Course(4002, "JQuery", 200, 200, 1003));
		courses3.add(new Course(4003, "HTML CSS JS", 200, 200, 1003));

		List<Category> categories = new ArrayList<>();
		categories.add(new Category(1001, "Cloud Computing", "network of remote servers", courses1));
		categories.add(new Category(1002, "DevOps", "network of remote servers", courses2));
		categories.add(new Category(1003, "Modern Web Development", "network of remote servers", courses3));
		
		/*Iterator<Category> categoryIterator= categories.iterator();
		while(categoryIterator.hasNext()) {
			Category Value = categoryIterator.next();
			System.out.println("Value: "+Value);
		} */
		
		courses2.forEach(course -> System.out.println(course.getName()+"("+course.getCourseId()+")"));
				
		return categories;
		
	}
	
}
