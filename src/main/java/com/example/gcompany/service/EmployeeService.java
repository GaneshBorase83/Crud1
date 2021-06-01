package com.example.gcompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.gcompany.domain.Employee;
import com.example.gcompany.repository.EmployeeRepository;
import com.example.gcompany.service.EmployeeService;
 
@Service
public class  EmployeeService{
	
	 @Autowired
	    private EmployeeRepository repository;
 
//	    @GetMapping("/")
	    public Employee save(Employee employee) {
	       return repository.save(employee);
	    }
 
	    public List<Employee> getAll() {
			
			return repository.findAll();
		}

	    public String delete(Long id) {
			repository.deleteById(id);
			return "Deleted";
		}
		public Employee saveOrUpdateEmployee(Employee employee) {
			repository.save(employee);
			return employee;
			}
}