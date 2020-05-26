package com.dockerstarter.demodockerdashboard.controller;

import java.util.Collection;

import com.dockerstarter.demodockerdashboard.model.EmployeeInfo;

public interface EmployeeServiceProxy {

	public EmployeeInfo findById(Long id);

	public Collection<EmployeeInfo> findAll();
}