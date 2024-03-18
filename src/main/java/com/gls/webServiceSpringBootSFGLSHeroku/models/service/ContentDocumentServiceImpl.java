package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gls.webServiceSpringBootSFGLSHeroku.models.dao.IContentDocumentDao;
import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentDocument;

@Service
public class ContentDocumentServiceImpl implements IContentDocumentService{
	
	@Autowired
	private IContentDocumentDao documentDao;
	
	private Logger logger = LoggerFactory.getLogger(ContentDocumentServiceImpl.class);
	
	@Override
	@Transactional(noRollbackFor = {ConstraintViolationException.class})
	public void saveAllDocumentos(List<ContentDocument> documentos)  {

		try {
	        // Proactive validation
	        List<String> existingSfids = documentDao.findAllSfids();
	        List<ContentDocument> validDocuments = documentos.stream()
	                .filter(c -> !existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        // Handling non-duplicate cases
	        documentDao.saveAll(validDocuments);
	
	        // Handling duplicate cases (example: logging for review)
	        List<ContentDocument> duplicateDocuments = documentos.stream()
	                .filter(c -> existingSfids.contains(c.getSfid()))
	                .collect(Collectors.toList());
	
	        if (!duplicateDocuments.isEmpty()) {
	            // Log for review or initiate other actions as needed
	        	logger.warn("Duplicate cases found: {}", duplicateDocuments.size());
	        }
	        logger.info("Los casos se guardaron perfectamente");
		}catch (Exception e) {
            System.out.println("*** Se ha producido un error inesperado: " + e.getMessage());
            logger.error("Los casos no se guardaron perfectamente");
		}
	}
	
	@Override
	public List<ContentDocument> findAll(){
		// TODO Auto-generated method stub
		return (List<ContentDocument>) documentDao.findAll();
	}
}
