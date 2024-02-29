package com.gls.webServiceSpringBootSFGLSHeroku.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Emailmessage;

public interface IEmailMessageDao extends CrudRepository<Emailmessage,Long>{
	
	@Query("SELECT DISTINCT e.sfid FROM Emailmessage e")
    List<String> findAllSfids();
	
	

}
