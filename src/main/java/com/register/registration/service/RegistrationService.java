package com.register.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.registration.model.RegistrationBean;
import com.register.registration.repository.RegisterRepository;

@Service
public class RegistrationService {
	
	@Autowired
	RegisterRepository registerRepository;

	public List<RegistrationBean> findAll() {
		return registerRepository.findAll();
	}

	public void save(RegistrationBean registrationBean) {
		registerRepository.save(registrationBean);
	}

}
