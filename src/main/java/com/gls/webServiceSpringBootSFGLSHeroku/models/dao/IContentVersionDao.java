package com.gls.webServiceSpringBootSFGLSHeroku.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentVersion;

public interface IContentVersionDao extends CrudRepository<ContentVersion,Long>{

	@Query("SELECT DISTINCT c.sfid FROM ContentVersion c")
    List<String> findAllSfids();
}
