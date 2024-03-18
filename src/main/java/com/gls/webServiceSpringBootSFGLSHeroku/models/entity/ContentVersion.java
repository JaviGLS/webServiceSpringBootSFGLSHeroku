package com.gls.webServiceSpringBootSFGLSHeroku.models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "contentversionpruebas")
public class ContentVersion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emailmessageprueba_seq")
	@SequenceGenerator(name = "emailmessageprueba_seq", sequenceName = "emailmessageprueba_id_seq", allocationSize = 1)
	private Long id;
	
	private String publishstatus;
	private String versionnumber;
	private String checksum;
	private String fileextension;
	private String origin;
	private Boolean ismajorversion;
	private String networkid;
	private String externaldatasourceid;
	private String tagcsv;
	private String sharingprivacy;
	private String versiondataurl;
	private Date lastmodifieddate;
	private String ownerid;
	private String contentlocation;
	private String contentdocumentid;
	private String firstpublishlocationid;
	private String pathonclient;
	private Boolean isdeleted;
	private Date contentmodifieddate;
	private Date systemmodstamp;
	private String lastmodifiedbyid;
	private String sharingoption;
	private Boolean islatest;
	private Integer ratingcount;
	private String contentmodifiedbyid;
	private String reasonforchange;
	private String contentbodyid;
	private String contenturl;
	private Date createddate;
	private String filetype;
	private Integer featuredcontentboost;
	private String title;
	private Integer positiveratingcount;
	private Date featuredcontentdate;
	private String createdbyid;
	private Integer contentsize;
	private Boolean isassetenabled;
	private String textpreview;
	private String description;
	private Integer negativeratingcount;
	private String externaldocumentinfo1;
	private String externaldocumentinfo2;
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
	public String getVersionnumber() {
		return versionnumber;
	}
	public void setVersionnumber(String versionnumber) {
		this.versionnumber = versionnumber;
	}
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	public String getFileextension() {
		return fileextension;
	}
	public void setFileextension(String fileextension) {
		this.fileextension = fileextension;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Boolean getIsmajorversion() {
		return ismajorversion;
	}
	public void setIsmajorversion(Boolean ismajorversion) {
		this.ismajorversion = ismajorversion;
	}
	public String getNetworkid() {
		return networkid;
	}
	public void setNetworkid(String networkid) {
		this.networkid = networkid;
	}
	public String getExternaldatasourceid() {
		return externaldatasourceid;
	}
	public void setExternaldatasourceid(String externaldatasourceid) {
		this.externaldatasourceid = externaldatasourceid;
	}
	public String getTagcsv() {
		return tagcsv;
	}
	public void setTagcsv(String tagcsv) {
		this.tagcsv = tagcsv;
	}
	public String getSharingprivacy() {
		return sharingprivacy;
	}
	public void setSharingprivacy(String sharingprivacy) {
		this.sharingprivacy = sharingprivacy;
	}
	public String getVersiondataurl() {
		return versiondataurl;
	}
	public void setVersiondataurl(String versiondataurl) {
		this.versiondataurl = versiondataurl;
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
	public String getContentlocation() {
		return contentlocation;
	}
	public void setContentlocation(String contentlocation) {
		this.contentlocation = contentlocation;
	}
	public String getContentdocumentid() {
		return contentdocumentid;
	}
	public void setContentdocumentid(String contentdocumentid) {
		this.contentdocumentid = contentdocumentid;
	}
	public String getFirstpublishlocationid() {
		return firstpublishlocationid;
	}
	public void setFirstpublishlocationid(String firstpublishlocationid) {
		this.firstpublishlocationid = firstpublishlocationid;
	}
	public String getPathonclient() {
		return pathonclient;
	}
	public void setPathonclient(String pathonclient) {
		this.pathonclient = pathonclient;
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
	public Boolean getIslatest() {
		return islatest;
	}
	public void setIslatest(Boolean islatest) {
		this.islatest = islatest;
	}
	public Integer getRatingcount() {
		return ratingcount;
	}
	public void setRatingcount(Integer ratingcount) {
		this.ratingcount = ratingcount;
	}
	public String getContentmodifiedbyid() {
		return contentmodifiedbyid;
	}
	public void setContentmodifiedbyid(String contentmodifiedbyid) {
		this.contentmodifiedbyid = contentmodifiedbyid;
	}
	public String getReasonforchange() {
		return reasonforchange;
	}
	public void setReasonforchange(String reasonforchange) {
		this.reasonforchange = reasonforchange;
	}
	public String getContentbodyid() {
		return contentbodyid;
	}
	public void setContentbodyid(String contentbodyid) {
		this.contentbodyid = contentbodyid;
	}
	public String getContenturl() {
		return contenturl;
	}
	public void setContenturl(String contenturl) {
		this.contenturl = contenturl;
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
	public Integer getFeaturedcontentboost() {
		return featuredcontentboost;
	}
	public void setFeaturedcontentboost(Integer featuredcontentboost) {
		this.featuredcontentboost = featuredcontentboost;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPositiveratingcount() {
		return positiveratingcount;
	}
	public void setPositiveratingcount(Integer positiveratingcount) {
		this.positiveratingcount = positiveratingcount;
	}
	public Date getFeaturedcontentdate() {
		return featuredcontentdate;
	}
	public void setFeaturedcontentdate(Date featuredcontentdate) {
		this.featuredcontentdate = featuredcontentdate;
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
	public Boolean getIsassetenabled() {
		return isassetenabled;
	}
	public void setIsassetenabled(Boolean isassetenabled) {
		this.isassetenabled = isassetenabled;
	}
	public String getTextpreview() {
		return textpreview;
	}
	public void setTextpreview(String textpreview) {
		this.textpreview = textpreview;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getNegativeratingcount() {
		return negativeratingcount;
	}
	public void setNegativeratingcount(Integer negativeratingcount) {
		this.negativeratingcount = negativeratingcount;
	}
	public String getExternaldocumentinfo1() {
		return externaldocumentinfo1;
	}
	public void setExternaldocumentinfo1(String externaldocumentinfo1) {
		this.externaldocumentinfo1 = externaldocumentinfo1;
	}
	public String getExternaldocumentinfo2() {
		return externaldocumentinfo2;
	}
	public void setExternaldocumentinfo2(String externaldocumentinfo2) {
		this.externaldocumentinfo2 = externaldocumentinfo2;
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
