package com.gls.webServiceSpringBootSFGLSHeroku.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Case;
import com.gls.webServiceSpringBootSFGLSHeroku.models.service.ICaseService;

@CrossOrigin(origins = {"http://localhost:3306","*"})
@RestController
@RequestMapping("/api")
public class CaseRestController {
	
	@Autowired
	private ICaseService caseService;

	@GetMapping("/casos")
	public List<Case> index(){
		
		return caseService.findAllCases();
		
	}
	

}
