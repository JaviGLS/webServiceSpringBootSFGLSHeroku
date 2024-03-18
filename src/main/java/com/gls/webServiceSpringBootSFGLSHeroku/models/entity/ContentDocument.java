package com.gls.webServiceSpringBootSFGLSHeroku.models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "contentdocumentpruebas")
public class ContentDocument {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "contentdocumentpruebas_seq")
	@SequenceGenerator(name = "contentdocumentpruebas_seq", sequenceName = "contentdocumentpruebas_id_seq", allocationSize = 1)
	private Long id;
	
	private String publishstatus;
	private String fileextension;
	private String parentid;
	private Date lastvieweddate;
	private String latestpublishedversionid;
	private String sharingprivacy;
	private Boolean isarchived;
	private Date lastmodifieddate;
	private String ownerid;
	private Boolean isdeleted;
	private Date contentmodifieddate;
	private Date systemmodstamp;
	private Date archiveddate;
	private String lastmodifiedbyid;
	private String sharingoption;
	private String contentassetid;
	private String archivedbyid;
	private Date createddate;
	private String filetype;
	private String title;
	private String createdbyid;
	private Integer contentsize;
	private String description;
	private Date lastreferenceddate;
	private String sfid;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPublishstatus() {
		return publishstatus;
	}
	public void setPublishstatus(String publishstatus) {
		this.publishstatus = publishstatus;
	}
	public String getFileextension() {
		return fileextension;
	}
	public void setFileextension(String fileextension) {
		this.fileextension = fileextension;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public Date getLastvieweddate() {
		return lastvieweddate;
	}
	public void setLastvieweddate(Date lastvieweddate) {
		this.lastvieweddate = lastvieweddate;
	}
	public String getLatestpublishedversionid() {
		return latestpublishedversionid;
	}
	public void setLatestpublishedversionid(String latestpublishedversionid) {
		this.latestpublishedversionid = latestpublishedversionid;
	}
	public String getSharingprivacy() {
		return sharingprivacy;
	}
	public void setSharingprivacy(String sharingprivacy) {
		this.sharingprivacy = sharingprivacy;
	}
	public Boolean getIsarchived() {
		return isarchived;
	}
	public void setIsarchived(Boolean isarchived) {
		this.isarchived = isarchived;
	}
	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}
	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}
	public String getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}
	public Boolean getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public Date getContentmodifieddate() {
		return contentmodifieddate;
	}
	public void setContentmodifieddate(Date contentmodifieddate) {
		this.contentmodifieddate = contentmodifieddate;
	}
	public Date getSystemmodstamp() {
		return systemmodstamp;
	}
	public void setSystemmodstamp(Date systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}
	public Date getArchiveddate() {
		return archiveddate;
	}
	public void setArchiveddate(Date archiveddate) {
		this.archiveddate = archiveddate;
	}
	public String getLastmodifiedbyid() {
		return lastmodifiedbyid;
	}
	public void setLastmodifiedbyid(String lastmodifiedbyid) {
		this.lastmodifiedbyid = lastmodifiedbyid;
	}
	public String getSharingoption() {
		return sharingoption;
	}
	public void setSharingoption(String sharingoption) {
		this.sharingoption = sharingoption;
	}
	public String getContentassetid() {
		return contentassetid;
	}
	public void setContentassetid(String contentassetid) {
		this.contentassetid = contentassetid;
	}
	public String getArchivedbyid() {
		return archivedbyid;
	}
	public void setArchivedbyid(String archivedbyid) {
		this.archivedbyid = archivedbyid;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreatedbyid() {
		return createdbyid;
	}
	public void setCreatedbyid(String createdbyid) {
		this.createdbyid = createdbyid;
	}
	public Integer getContentsize() {
		return contentsize;
	}
	public void setContentsize(Integer contentsize) {
		this.contentsize = contentsize;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getLastreferenceddate() {
		return lastreferenceddate;
	}
	public void setLastreferenceddate(Date lastreferenceddate) {
		this.lastreferenceddate = lastreferenceddate;
	}
	public String getSfid() {
		return sfid;
	}
	public void setSfid(String sfid) {
		this.sfid = sfid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private static final long serialVersionUID = 1L;
}
