package com.gls.webServiceSpringBootSFGLSHeroku.models.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Case;

public interface ICaseDao extends JpaRepository<Case, Long>{
	
	@Query(value="SELECT * FROM salesforcebackup.casebackup WHERE salesforcebackup.casebackup.Origin != 'Qualtrics' LIMIT 10000",nativeQuery=true)
	public List<Case> findAllCases();
}
