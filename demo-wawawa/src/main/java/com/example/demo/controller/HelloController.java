package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.FormData;

@Controller
public class HelloController {

	@GetMapping("index")
	public String index(Model model) {
	    model.addAttribute("formData", new FormData());
	    return "index";
	}


	@PostMapping("/submit")
	public String handleSubmit(@ModelAttribute FormData formData, Model model) {
		model.addAttribute("formData", formData);
		return "result";
	}
}
