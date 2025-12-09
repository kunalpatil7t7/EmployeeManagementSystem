package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmsService;

import jakarta.validation.Valid;

@RestController
public class Controller {

	@Autowired
	private EmsService emsService;
	

	
	@GetMapping("/")
	public String home() {
		return "Welcome to employee system";
	}
	
	@GetMapping("/employee")
	public List<Employee> getallEmployee(){
		return emsService.getallEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeByid(@PathVariable int id){	
		return emsService.getEmployeeById(id);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee (@Valid @RequestBody Employee employee) {
		return emsService.addEmployee(employee);
	}
	 
	@PutMapping("/employee/{id}")
	public Employee updateEmployee (@PathVariable int id ,@Valid @RequestBody Employee Edetails) {
		return emsService.updateEmployee(id, Edetails);
	}
	
}
