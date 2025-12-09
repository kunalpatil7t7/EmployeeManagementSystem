package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmsRepo;

@Service
public class EmsService {

	@Autowired
	public EmsRepo emsRepo;
	
	public List<Employee>getallEmployees(){
	return emsRepo.findAll();	
	}
	
	public Optional<Employee> getEmployeeById(int id){
		return emsRepo.findById(id);
	}
	
	public Employee addEmployee (Employee employee) {
		return emsRepo.save(employee);
	}
	
	public Employee updateEmployee(int id , Employee Edetails) {
		Employee EList = emsRepo.findById(id)
			.orElseThrow(() -> new RuntimeException("Empoyee not found with Id:" + id));
		EList.setName(Edetails.getName().trim());
		EList.setDepartment(Edetails.getDepartment().trim());
		EList.setSalary(Edetails.getSalary());
		
		return emsRepo.save(EList);
	}
	
}
