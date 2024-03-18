package com.gls.webServiceSpringBootSFGLSHeroku.models.service;

import java.util.List;

import com.gls.webServiceSpringBootSFGLSHeroku.models.entity.ContentDocument;

public interface IContentDocumentService {
	
	public List<ContentDocument> findAll();
	public void saveAllDocumentos(List<ContentDocument> documentos);
}
