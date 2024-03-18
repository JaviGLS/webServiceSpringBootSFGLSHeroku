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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentDocument;
import com.gls.webServiceSpringBootSFGLSHeroku.models.service.IContentDocumentService;

@CrossOrigin(origins = {"http://localhost:3306","*"})
@RestController
@RequestMapping("/api")
public class ContentDocumentRestController {
	
	@Autowired
	private IContentDocumentService documentosService;
	 @Autowired
	 private AsyncProcessor asyncProcessor;
	
	@GetMapping("/documento")
	public List<ContentDocument> index(){
		
		 return documentosService.findAll();
	}
	
	@PostMapping("/documentos")
	//@ResponseStatus(HttpStatus.CREATED.)
	public ResponseEntity<String>  create(@RequestBody List<ContentDocument> documentos) {
		System.out.println("*** esto es lo que hay en documentos rest controller: "+documentos.size());
		asyncProcessor.processDocumentosAsync(documentos);
		return ResponseEntity.status(HttpStatus.CREATED).body("Todo ha ido bien");
	}

}
