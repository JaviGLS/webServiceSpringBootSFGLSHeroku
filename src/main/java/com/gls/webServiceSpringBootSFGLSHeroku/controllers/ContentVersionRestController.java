package com.gls.webServiceSpringBootSFGLSHeroku.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentVersion;
import com.gls.webServiceSpringBootSFGLSHeroku.models.service.IContentVersionService;

@CrossOrigin(origins = {"http://localhost:3306","*"})
@RestController
@RequestMapping("/api")
public class ContentVersionRestController {
	
	@Autowired
	private IContentVersionService versionesService;
	 @Autowired
	 private AsyncProcessor asyncProcessor;
	
	@GetMapping("/version")
	public List<ContentVersion> index(){
		
		 return versionesService.findAll();
	}
	
	@PostMapping("/versiones")
	public ResponseEntity<String> create(@RequestBody List<ContentVersion> versiones) {
		System.out.println("*** esto es lo que hay en versiones rest controller: "+versiones.size());
		asyncProcessor.processVersionesAsync(versiones);
		return ResponseEntity.status(HttpStatus.CREATED).body("Todo ha ido bien");
	}
}
