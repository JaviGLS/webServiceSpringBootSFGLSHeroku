package com.gls.webServiceSpringBootSFGLSHeroku.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "casosprueba")
public class Case implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombreagencia__c;
	private String gls_otrosubtipo__c;
	private String asm_txt_c_digo_postal_cliente_final__c;
	private String priority;
	private String ultimoestadoenvio__c;
	private String recordtypeid;
	private String origin;
	private String codplaza_dst__c;
	private String subject;
	private String apellidos__c;
	private String ownerid;
	private String sub_tipo__c;
	private String suppliedphone;
	private String status;
	private String estadoenvio__c;
	private Date createddate;
	private String ultimoestadoincidencia__c;
	private String tipo_de_reclamacion__c;
	private String asm_num_numero_de_expedicion__c;
	private String casenumber;
	private String type;
	private Date closeddate;
	private String nombre__c;
	private String description;
	private String cola_asignacion__c;
	private Double n_mero_gestiones_realizadas__c;
	private String suppliedemail;
	private String sfid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreagencia__c() {
		return nombreagencia__c;
	}

	public void setNombreagencia__c(String nombreagencia__c) {
		this.nombreagencia__c = nombreagencia__c;
	}

	public String getGls_otrosubtipo__c() {
		return gls_otrosubtipo__c;
	}

	public void setGls_otrosubtipo__c(String gls_otrosubtipo__c) {
		this.gls_otrosubtipo__c = gls_otrosubtipo__c;
	}

	public String getAsm_txt_c_digo_postal_cliente_final__c() {
		return asm_txt_c_digo_postal_cliente_final__c;
	}

	public void setAsm_txt_c_digo_postal_cliente_final__c(String asm_txt_c_digo_postal_cliente_final__c) {
		this.asm_txt_c_digo_postal_cliente_final__c = asm_txt_c_digo_postal_cliente_final__c;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getUltimoestadoenvio__c() {
		return ultimoestadoenvio__c;
	}

	public void setUltimoestadoenvio__c(String ultimoestadoenvio__c) {
		this.ultimoestadoenvio__c = ultimoestadoenvio__c;
	}

	public String getRecordtypeid() {
		return recordtypeid;
	}

	public void setRecordtypeid(String recordtypeid) {
		this.recordtypeid = recordtypeid;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCodplaza_dst__c() {
		return codplaza_dst__c;
	}

	public void setCodplaza_dst__c(String codplaza_dst__c) {
		this.codplaza_dst__c = codplaza_dst__c;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getApellidos__c() {
		return apellidos__c;
	}

	public void setApellidos__c(String apellidos__c) {
		this.apellidos__c = apellidos__c;
	}

	public String getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}

	public String getSub_tipo__c() {
		return sub_tipo__c;
	}

	public void setSub_tipo__c(String sub_tipo__c) {
		this.sub_tipo__c = sub_tipo__c;
	}

	public String getSuppliedphone() {
		return suppliedphone;
	}

	public void setSuppliedphone(String suppliedphone) {
		this.suppliedphone = suppliedphone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEstadoenvio__c() {
		return estadoenvio__c;
	}

	public void setEstadoenvio__c(String estadoenvio__c) {
		this.estadoenvio__c = estadoenvio__c;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getUltimoestadoincidencia__c() {
		return ultimoestadoincidencia__c;
	}

	public void setUltimoestadoincidencia__c(String ultimoestadoincidencia__c) {
		this.ultimoestadoincidencia__c = ultimoestadoincidencia__c;
	}

	public String getTipo_de_reclamacion__c() {
		return tipo_de_reclamacion__c;
	}

	public void setTipo_de_reclamacion__c(String tipo_de_reclamacion__c) {
		this.tipo_de_reclamacion__c = tipo_de_reclamacion__c;
	}

	public String getAsm_num_numero_de_expedicion__c() {
		return asm_num_numero_de_expedicion__c;
	}

	public void setAsm_num_numero_de_expedicion__c(String asm_num_numero_de_expedicion__c) {
		this.asm_num_numero_de_expedicion__c = asm_num_numero_de_expedicion__c;
	}

	public String getCasenumber() {
		return casenumber;
	}

	public void setCasenumber(String casenumber) {
		this.casenumber = casenumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCloseddate() {
		return closeddate;
	}

	public void setCloseddate(Date closeddate) {
		this.closeddate = closeddate;
	}

	public String getNombre__c() {
		return nombre__c;
	}

	public void setNombre__c(String nombre__c) {
		this.nombre__c = nombre__c;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCola_asignacion__c() {
		return cola_asignacion__c;
	}

	public void setCola_asignacion__c(String cola_asignacion__c) {
		this.cola_asignacion__c = cola_asignacion__c;
	}

	public Double getN_mero_gestiones_realizadas__c() {
		return n_mero_gestiones_realizadas__c;
	}

	public void setN_mero_gestiones_realizadas__c(Double n_mero_gestiones_realizadas__c) {
		this.n_mero_gestiones_realizadas__c = n_mero_gestiones_realizadas__c;
	}

	public String getSuppliedemail() {
		return suppliedemail;
	}

	public void setSuppliedemail(String suppliedemail) {
		this.suppliedemail = suppliedemail;
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
