package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gls.webServiceSpringBootSFGLSHeroku.models.dao.ICaseDao;
import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Case;

@Service
public class CaseServiceImpl implements ICaseService{
     
	@Autowired
	private ICaseDao caseDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Case> findAllCases(){
		
		return (List<Case>) caseDao.findAllCases();
	}

}
