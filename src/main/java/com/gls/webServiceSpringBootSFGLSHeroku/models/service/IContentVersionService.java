package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentVersion;

public interface IContentVersionService {

	public List<ContentVersion> findAll();
	public void saveAllversiones(List<ContentVersion> versiones);
}
