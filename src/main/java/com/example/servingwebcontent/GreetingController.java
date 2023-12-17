package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	// The following annotation ascertains that HTTP requests towards '/greeting' are 
	// properly mapped to the 'greeting()' method.
	@GetMapping("/greeting")
	// The annotation @RequestParam binds the value of the query stiring 'name' to the actual parameter
	// 'name' passed to the 'greeting()' method.
	// The parameter 'name' is optional, and defaults to 'World' if no value was given.
	public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model)
	{
		model.addAttribute("name", name);
		return "greeting";
	}
}
