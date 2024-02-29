package com.gls.webServiceSpringBootSFGLSHeroku.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Emailmessage;
import com.gls.webServiceSpringBootSFGLSHeroku.models.service.IEmailMessageService;

@CrossOrigin(origins = {"http://localhost:3306","*"})
@RestController
@RequestMapping("/api")
public class EmailmessageRestController {
	
	@Autowired
	private IEmailMessageService emailService;
	
	
	@GetMapping("/email")
	public List<Emailmessage> index(){
		System.out.println("*** esto es lo que hay en email rest controller GET");
		return (List<Emailmessage>) emailService.findAllcorreos();
		
	}
	
	@PostMapping("/emails")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody List<Emailmessage> mails) {
		System.out.println("*** esto es lo que hay en contracts rest controller"+mails);
		emailService.saveAllEmail(mails);
	}

}
