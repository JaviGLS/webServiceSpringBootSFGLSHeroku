package com.gls.webServiceSpringBootSFGLSHeroku.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentDocument;

public interface IContentDocumentDao extends CrudRepository<ContentDocument,Long>{
	
	@Query("SELECT DISTINCT c.sfid FROM ContentDocument c")
    List<String> findAllSfids();

}
