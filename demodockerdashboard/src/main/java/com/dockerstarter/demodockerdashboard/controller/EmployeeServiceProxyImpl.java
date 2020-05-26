package com.dockerstarter.demodockerdashboard.controller;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dockerstarter.demodockerdashboard.model.EmployeeInfo;

@Service
public class EmployeeServiceProxyImpl implements EmployeeServiceProxy {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public EmployeeInfo findById(Long id) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<EmployeeInfo> entity = new HttpEntity<EmployeeInfo>(headers);
		System.out.println("EmployeeServiceProxyImpl.findById()");
		return restTemplate
				.exchange("http://CLIENT-CONFIG/employee/find/" + id, HttpMethod.GET, entity, EmployeeInfo.class)
				.getBody();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<EmployeeInfo> findAll() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Collection<EmployeeInfo>> entity = new HttpEntity<Collection<EmployeeInfo>>(headers);
		System.out.println("EmployeeServiceProxyImpl.findAll()");
		return restTemplate.exchange("http://CLIENT-CONFIG/employee/findall", HttpMethod.GET, entity, Collection.class)
				.getBody();

	}

}
