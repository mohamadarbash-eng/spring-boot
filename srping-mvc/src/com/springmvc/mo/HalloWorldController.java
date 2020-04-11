package com.springmvc.mo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HalloWorldController {

	@RequestMapping("/showForm")
	public String showInitForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String showProcessForm() {
		return "process-form";
	}
}