package com.springmvc.mo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HalloWorldController {

	@RequestMapping("/showForm")
	public String showInitForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String showProcessForm() {
		return "process-form";
	}
	
	@RequestMapping("/processFormFun")
	public String haveFun(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		String result = "Yo! " + theName;
		
		model.addAttribute("message", result);
		
		return "process-form";
	}
	
	@RequestMapping("/processFormSad")
	public String haveSad(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toUpperCase();
		String result = "Yo!YO " + theName;
		
		model.addAttribute("message", result);
		
		return "process-form";
	}
}