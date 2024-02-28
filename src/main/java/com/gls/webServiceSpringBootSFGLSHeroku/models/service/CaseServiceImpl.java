package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.exception.ConstraintViolationException;
import org.postgresql.util.PSQLException;
import org.springframework.dao.DataIntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gls.webServiceSpringBootSFGLSHeroku.models.dao.ICaseDao;
import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Case;

@Service
public class CaseServiceImpl implements ICaseService{
     
	@Autowired
	private ICaseDao caseDao;
	
	private Logger logger = LoggerFactory.getLogger(CaseServiceImpl.class);
	
	@Override
	@Transactional(noRollbackFor = {ConstraintViolationException.class})
	public void saveAllCases(List<Case> casos)  {
	   /* try {
			// TODO Auto-generated method stub
			System.out.println("*** esto es lo que hay en contracts"+casos);
			caseDao.saveAll(casos);
	    } catch (DataIntegrityViolationException e) {
	        System.out.println("*** se ha producido un error: " + e.getMessage());
	    } catch (ConstraintViolationException e) {
            System.out.println("*** Se ha producido un error inesperado: " + e.getMessage());
            // Manejar otros errores
        } catch (javax.validation.ConstraintViolationException e) {
            System.out.println("*** Se ha producido un error inesperado: " + e.getMessage());
            // Manejar otros errores
        }*/
		try {
	        // Proactive validation
	        List<String> existingSfids = caseDao.findAllSfids();
	        List<Case> validCases = casos.stream()
	                .filter(c -> !existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        // Handling non-duplicate cases
	        caseDao.saveAll(validCases);
	
	        // Handling duplicate cases (example: logging for review)
	        List<Case> duplicateCases = casos.stream()
	                .filter(c -> existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        if (!duplicateCases.isEmpty()) {
	            // Log for review or initiate other actions as needed
	        	logger.warn("Duplicate cases found: {}", duplicateCases.size());
	        }
	        logger.info("Los casos se guardaron perfectamente");
		}catch (Exception e) {
            System.out.println("*** Se ha producido un error inesperado: " + e.getMessage());
            logger.error("Los casos no se guardaron perfectamente");
		}
	}
	
	@Override
	public List<Case> findAll(){
		// TODO Auto-generated method stub
		return (List<Case>) caseDao.findAll();
	}



}
