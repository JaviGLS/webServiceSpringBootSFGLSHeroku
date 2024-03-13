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


import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Case;
import com.gls.webServiceSpringBootSFGLSHeroku.models.service.ICaseService;

@CrossOrigin(origins = {"http://localhost:3306","*"})
@RestController
@RequestMapping("/api")
public class CaseRestController {
	@Autowired
	private ICaseService casosService;
	 @Autowired
	 private AsyncProcessor asyncProcessor;
	
	@GetMapping("/caso")
	public List<Case> index(){
		
		 return casosService.findAll();
	}
	
	@PostMapping("/casos")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody List<Case> casos) {
		System.out.println("*** esto es lo que hay en contracts rest controller"+casos.size());
		asyncProcessor.processCasesAsync(casos);
	}


	

}
