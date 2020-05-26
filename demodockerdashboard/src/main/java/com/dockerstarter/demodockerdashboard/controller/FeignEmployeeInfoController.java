package com.dockerstarter.demodockerdashboard.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dockerstarter.demodockerdashboard.model.EmployeeInfo;

@RefreshScope
@RestController
public class FeignEmployeeInfoController {
	
 @Autowired
 EmployeeServiceProxy proxyService;
 
 @RequestMapping("/dashboard/clientservice/{myself}")
 public EmployeeInfo findme(@PathVariable Long myself) {
	 System.out.println("demodockerdashboard FeignEmployeeInfoController.findme()");
  return proxyService.findById(myself);
 }
 @RequestMapping("/dashboard/clientservice/peers")
 public Collection < EmployeeInfo > findPeers() {
	 System.out.println("demodockerdashboard FeignEmployeeInfoController.findPeers()");
  return proxyService.findAll();
 }
}