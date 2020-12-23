package com.register.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.register.registration.model.RegistrationBean;
import com.register.registration.service.RegistrationService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	RegistrationService registrationServic;

	@GetMapping("/details")
	public String findAll(Model model) {
		List<RegistrationBean> list = registrationServic.findAll();
		System.out.println("List size "+list.size() +" List "+list);
		model.addAttribute("requestData", list);
		return "userDetails";
	}

	@PostMapping("/savedata")
	public String save(RegistrationBean registrationBean) {
		registrationServic.save(registrationBean);
		return "saved";
	}
}
