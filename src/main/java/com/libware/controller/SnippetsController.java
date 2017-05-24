package com.libware.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.libware.models.Section;
import com.libware.models.Snippet;




@Controller
public class SnippetsController {
	
	@RequestMapping("/snippet")
	public String find(
			@RequestParam(value="title", required=false)
			String title,
			@RequestParam(value="id", required=false)
			String id, 
			@RequestParam(value="technology", required=false)
			String technology, 
			@RequestParam(value="keywords", required=false)
			String keywords, 
			Model model)
	{
		Section[] sections = {
				new Section("Front end","using jquery to hide element","$('pre code').hide();","javascript"),
				new Section("Back end","declare number with value of 0","int n=0;","java")
		};
		
		String[] k = {"front end","back end"};
		
		Snippet snippet = new Snippet("Snippet Title !"+id,sections,k);

		model.addAttribute("snippet", snippet);
		return "snippet";
	} 
	 @RequestMapping("/")
	    public String home(){
	        return "login";
	    }
	 @RequestMapping("/index")
	    public String homeAgain(){
	        return "index";
	    }
	 @RequestMapping("/calendar")
	    public String calendar(){
	        return "calendar";
	    }
	 @RequestMapping("/editor")
	    public String editor(){
	        return "editor";
	    }
	 @RequestMapping("/circle")
	    public String circle(){
	        return "circle";
	    }
	 @RequestMapping("/add_snippet")
	    public String add_snippet(){
	        return "add_snippet";
	    }
	 @RequestMapping("/login")
	    public String homeSecond(){
	        return "login";
	    }
	 @RequestMapping("/profile")
	    public String profile(){
	        return "profile";
	    }
	 @RequestMapping("/new_user")
	    public String newUser(){
	        return "new_user";
	    }
	 @RequestMapping("/add_contact")
	    public String addContact(){
	        return "add_contact";
	    }
}
