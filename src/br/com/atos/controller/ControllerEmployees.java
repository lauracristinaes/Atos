package br.com.atos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * Author: Laura C E Santo
 * Controller Employees
 * 
 * 
 * */

@Controller

public class ControllerEmployees {
	
	public ControllerEmployees() {}
	
	@RequestMapping("/employees")
	public String employees(Model model){

		Util util = new Util();
		model.addAttribute("employees", util.ReadJSON());

		return "employees";
	}

}
