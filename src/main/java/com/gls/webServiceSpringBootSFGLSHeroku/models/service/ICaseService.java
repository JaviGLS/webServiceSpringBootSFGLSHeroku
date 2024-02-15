package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.Case;

public interface ICaseService {
	

	public List<Case> findAllCases();

}
