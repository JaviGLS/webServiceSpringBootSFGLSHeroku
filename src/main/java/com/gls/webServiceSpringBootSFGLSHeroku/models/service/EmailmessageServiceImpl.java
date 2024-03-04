package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.postgresql.util.PSQLException;
import org.springframework.dao.DataIntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gls.webServiceSpringBootSFGLSHeroku.models.dao.IEmailMessageDao;
import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Emailmessage;


@Service
public class EmailmessageServiceImpl implements IEmailMessageService{
	
	private Logger logger = LoggerFactory.getLogger(EmailmessageServiceImpl.class);
	
	@Autowired
	public IEmailMessageDao emailmessage;
	
	@Override
	@Transactional(readOnly = true)
	public List<Emailmessage> findAllcorreos() {

		return (List<Emailmessage>) emailmessage.findAll();
	}

	@Override
	@Transactional(noRollbackFor = {ConstraintViolationException.class})
	public void saveAllEmail(List<Emailmessage> mails) {
		// TODO Auto-generated method stub
		//emailmessage.saveAll(mails);
		try {
			logger.info("emails antes mails",mails.size());
	        // Proactive validation
	        List<String> existingSfids = emailmessage.findAllSfids();
	        List<Emailmessage> validmails = mails.stream()
	                .filter(c -> !existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        // Handling non-duplicate cases
	        logger.info("emails antes de salvar validCases",validmails.size());
	        emailmessage.saveAll(validmails);
	
	        // Handling duplicate cases (example: logging for review)
	        List<Emailmessage> duplicateCases = mails.stream()
	                .filter(c -> existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        if (!duplicateCases.isEmpty()) {
	            // Log for review or initiate other actions as needed
	        	logger.warn("Duplicate emails found: {}", duplicateCases.size());
	        }
	        logger.info("Los emails se guardaron perfectamente");
		}catch (ConstraintViolationException e) {
            System.out.println("*** Se ha producido un error inesperado: " + e.getMessage());
            logger.error("Los emails no se guardaron perfectamente",e.getMessage());
		}
	}

}
