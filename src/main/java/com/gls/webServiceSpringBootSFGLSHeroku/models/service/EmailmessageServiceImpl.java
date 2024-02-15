package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gls.webServiceSpringBootSFGLSHeroku.models.dao.IEmailMessageDao;
import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Emailmessage;


@Service
public class EmailmessageServiceImpl implements IEmailMessageService{
	
	@Autowired
	public IEmailMessageDao emailmessage;
	
	@Override
	@Transactional(readOnly = true)
	public List<Emailmessage> findAllcorreos() {

		return (List<Emailmessage>) emailmessage.findAllcorreos();
	}

}
