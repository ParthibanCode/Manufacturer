package com.example.manufacture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.manufacture.entity.Component;
import com.example.manufacture.service.ComponentService;

@RestController
public class ComponentController {

	@Autowired
	ComponentService compService;
	
	@PostMapping("/component")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addComponent(@RequestBody Component c1) {
		compService.addComponent(c1);
	}

}
