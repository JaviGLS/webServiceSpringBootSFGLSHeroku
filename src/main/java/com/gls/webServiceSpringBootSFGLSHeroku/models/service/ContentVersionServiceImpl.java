package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gls.webServiceSpringBootSFGLSHeroku.models.dao.IContentVersionDao;
import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentVersion;

@Service
public class ContentVersionServiceImpl implements IContentVersionService{
	
	@Autowired
	private IContentVersionDao versionDao;
	
	private Logger logger = LoggerFactory.getLogger(ContentVersionServiceImpl.class);
	
	@Override
	@Transactional(noRollbackFor = {ConstraintViolationException.class})
	public void saveAllversiones(List<ContentVersion> versiones)  {

		try {
	        // Proactive validation
	        List<String> existingSfids = versionDao.findAllSfids();
	        List<ContentVersion> validDocuments = versiones.stream()
	                .filter(c -> !existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        // Handling non-duplicate cases
	        versionDao.saveAll(validDocuments);
	
	        // Handling duplicate cases (example: logging for review)
	        List<ContentVersion> duplicateVersiones = versiones.stream()
	                .filter(c -> existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        if (!duplicateVersiones.isEmpty()) {
	            // Log for review or initiate other actions as needed
	        	logger.warn("Duplicate cases found: {}", duplicateVersiones.size());
	        }
	        logger.info("Los casos se guardaron perfectamente");
		}catch (Exception e) {
            System.out.println("*** Se ha producido un error inesperado: " + e.getMessage());
            logger.error("Los casos no se guardaron perfectamente");
		}
	}
	
	@Override
	public List<ContentVersion> findAll(){
		// TODO Auto-generated method stub
		return (List<ContentVersion>) versionDao.findAll();
	}
}
