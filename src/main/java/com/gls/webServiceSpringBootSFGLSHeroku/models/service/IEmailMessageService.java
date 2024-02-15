package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Emailmessage;

public interface IEmailMessageService {
	
	public List<Emailmessage> findAllcorreos();

}
