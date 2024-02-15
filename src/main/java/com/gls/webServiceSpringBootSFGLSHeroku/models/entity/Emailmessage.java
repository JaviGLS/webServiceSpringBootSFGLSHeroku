package com.gls.webServiceSpringBootSFGLSHeroku.models.entity;

import java.io.Serializable;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emailmessagebackup")
public class Emailmessage implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String relatedtoid;
	private String parentid;
	private String fromaddress;
	private String name;
	private String subject;
	private String htmlbody;
	private String status;
	private String ccaddress;
	private Date messagedate;
	private String fromname;
	private Date createddate;
	private String toaddress;
	private String sfid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRelatedtoid() {
		return relatedtoid;
	}

	public void setRelatedtoid(String relatedtoid) {
		this.relatedtoid = relatedtoid;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getFromaddress() {
		return fromaddress;
	}

	public void setFromaddress(String fromaddress) {
		this.fromaddress = fromaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getHtmlbody() {
		return htmlbody;
	}

	public void setHtmlbody(String htmlbody) {
		this.htmlbody = htmlbody;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCcaddress() {
		return ccaddress;
	}

	public void setCcaddress(String ccaddress) {
		this.ccaddress = ccaddress;
	}

	public Date getMessagedate() {
		return messagedate;
	}

	public void setMessagedate(Date messagedate) {
		this.messagedate = messagedate;
	}

	public String getFromname() {
		return fromname;
	}

	public void setFromname(String fromname) {
		this.fromname = fromname;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getToaddress() {
		return toaddress;
	}

	public void setToaddress(String toaddress) {
		this.toaddress = toaddress;
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
