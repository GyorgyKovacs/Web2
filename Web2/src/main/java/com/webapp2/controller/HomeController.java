package com.webapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.webapp2.domain.Visitor;
import com.webapp2.service.VisitorService;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/entry")
	public String getEntry() {
		return "entry";
	}

	@GetMapping("/main")
	public String getMain() {
		return "main";
	}

	@Autowired
	private VisitorService visitorService;

	@GetMapping("/visitors")
	public String getVisitors(Model model) {
		model.addAttribute("visitors", visitorService.getVisitors());
		return "visitors";
	}

	@GetMapping("/reg")
	public String getReg() {
		return "reg";
	}

	@GetMapping("/cv")
	public String getCv() {
		return "cv";
	}

	@PostMapping("/save")
	public String save(Visitor visitor) {
		visitorService.save(visitor);
		return "redirect:/visitors";
	}
}
