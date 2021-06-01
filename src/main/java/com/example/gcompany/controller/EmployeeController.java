package com.example.gcompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.gcompany.domain.Employee;
import com.example.gcompany.service.EmployeeService;
 
@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService service;
		@GetMapping("/getstudents")
		public List<Employee> getEmployee() {
			return service.getAll();
		}
		
		@PostMapping("/create")
		public Employee create(@RequestBody Employee employee) {
			
			return service.save(employee);
		}
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable Long id) {
			return service.delete(id);
		}
		
		@PutMapping(path="/updatestudent")
		public Employee updateEmployee(@RequestBody Employee employee) {
			service.saveOrUpdateEmployee(employee);
			return employee;
		}
}
