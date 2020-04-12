package com.springmvc.mo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bye")
public class ByeWorld {

	@RequestMapping("/showForm")
	public String displayInitForm() {
		return "silly-form";
	}
}
