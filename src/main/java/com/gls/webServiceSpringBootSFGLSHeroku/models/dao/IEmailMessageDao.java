package com.gls.webServiceSpringBootSFGLSHeroku.models.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Emailmessage;

public interface IEmailMessageDao extends JpaRepository<Emailmessage,Long>{
	
	/*@Query(value="SELECT sfid FROM salesforcebackup.emailmessagebackup LIMIT 1",nativeQuery=true)
	public List<Emailmessage> findAllEmail();*/
	@Query(value="SELECT * FROM salesforcebackup.emailmessagebackup LIMIT 5000", nativeQuery = true)
	public List<Emailmessage> findAllcorreos();

}
