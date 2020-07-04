package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
	List<Customer> customers = customerservice.getCustomers();
	
	theModel.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("customerId") int theId,Model theModel) {
		
		Customer thecustomer = customerservice.getCustomer(theId);
		theModel.addAttribute("customer", thecustomer);
		return "customer-form";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerservice.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

}
