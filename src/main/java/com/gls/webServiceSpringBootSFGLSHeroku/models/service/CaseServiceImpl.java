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
	@Transactional
	public void saveAllCases(List<Case> casos) {
		// TODO Auto-generated method stub
		System.out.println("*** esto es lo que hay en contracts"+casos);
		caseDao.saveAll(casos);
	}

	@Override
	public List<Case> findAll(){
		// TODO Auto-generated method stub
		return (List<Case>) caseDao.findAll();
	}



}
