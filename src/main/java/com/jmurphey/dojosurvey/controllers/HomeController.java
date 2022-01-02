package com.jmurphey.dojosurvey.controllers;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jmurphey.dojosurvey.models.Survey;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("locations",  new String[] {"San Jose", "Oakland", "Nashville", "Chicago"});
		model.addAttribute("languages",  new String[] {"Java", "Python", "MERN", "JavaScript"});
		return "index.jsp";
	}

	@PostMapping("/result")
	public String result(@RequestParam(value="name")String name, @RequestParam("location")String location,@RequestParam("language")String language, @RequestParam("comment")String comment, Model model) {
		model.addAttribute("result", new Survey(name, location, language, comment));
		return "result.jsp";
	}

// --- Different attempts to accomplish this Assignment ---

//	@GetMapping("")
//	public String index() {
//		return "index.jsp";
//	}
//	
//	@PostMapping("/submit")
//	public String test(@RequestParam(value="name")String name, @RequestParam(value = "location") String location,
//			@RequestParam(value = "comment") String comment, HttpSession session) {
//		session.setAttribute("name", name);
//		session.setAttribute("location", location);
//		session.setAttribute("comment", comment);
//
//		return "redirect:/result";
//	}

// --- booting someone who chose chicago as their location // Honestly need to review what I was exactly doing here ---

//	@GetMapping("/result")
//	public String result(HttpSession session) {
//		if (session.getAttribute("location").equals("chicago")) {
//			return "index.jsp";	
//		}
//
//		return "result.jsp"; 
//	}
	
	
	
//	@PostMapping("/submit")
//	public String test(HttpSession session, @RequestParam(value="name")String name, @RequestParam("location")String location,@RequestParam("language")String language, @RequestParam("comment")String comment) {
//		session.setAttribute("name", name);
//		session.setAttribute("location", location);
//		session.setAttribute("language", language);
//		session.setAttribute("comment", comment);
//		return "redirect:/result";
//	}
	
	
	
}
