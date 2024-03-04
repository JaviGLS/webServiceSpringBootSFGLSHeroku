package com.gls.webServiceSpringBootSFGLSHeroku.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Case;
import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Emailmessage;

import com.gls.webServiceSpringBootSFGLSHeroku.models.service.ICaseService;
import com.gls.webServiceSpringBootSFGLSHeroku.models.service.IEmailMessageService;

@Component
public class AsyncProcessor {
	
    @Autowired
    private ICaseService casoService;
    @Autowired
    private IEmailMessageService emailService;

    @Async
    public void processCasesAsync(List<Case> casos) {
        casoService.saveAllCases(casos);
    }
    
    @Async
    public void processEmailsAsync(List<Emailmessage> mails) {
    	emailService.saveAllEmail(mails);
    }
	

}
