package com.dockerstarter.demodockereurekaclient.controller;

import java.util.Collection;

import com.dockerstarter.demodockereurekaclient.domain.model.Employee;
import com.dockerstarter.demodockereurekaclient.service.EmployeeSearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EmployeeSearchController {
 @Autowired
 EmployeeSearchService employeeSearchService;
 @RequestMapping("/employee/find/{id}")
 public Employee findById(@PathVariable Long id) {
	 System.out.println("demodockereurekaclient EmployeeSearchController.findById()");
  return employeeSearchService.findById(id);
 }
 @RequestMapping("/employee/findall")
 public Collection < Employee > findAll() {
	 System.out.println("demodockereurekaclient EmployeeSearchController.findAll()");
  return employeeSearchService.findAll();
 }
}