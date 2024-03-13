package com.gls.webServiceSpringBootSFGLSHeroku.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "casosprueba")
public class Case implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "casosprueba_seq")
	@SequenceGenerator(name = "casosprueba_seq", sequenceName = "casosprueba_id_seq", allocationSize = 1)
	private Long id;

	
	@Column(name = "nombreagencia__c")
	private String nombreagencia;
	@Column(name = "gls_otrosubtipo__c")
	private String gls_otrosubtipo;
	@Column(name = "asm_txt_c_digo_postal_cliente_final__c")
	private String asm_txt_c_digo_postal_cliente_final;
	private String priority;
	@Column(name = "ultimoestadoenvio__c")
	private String ultimoestadoenvio;
	private String recordtypeid;
	private String origin;
	@Column(name = "codplaza_dst__c")
	private String codplaza_dst;
	private String subject;
	@Column(name = "apellidos__c")
	private String apellidos;
	private String ownerid;
	@Column(name = "sub_tipo__c")
	private String sub_tipo;
	private String suppliedphone;
	private String status;
	@Column(name = "estadoenvio__c")
	private String estadoenvio;
	private Date createddate;
	@Column(name = "ultimoestadoincidencia__c")
	private String ultimoestadoincidencia;
	@Column(name = "tipo_de_reclamacion__c")
	private String tipo_de_reclamacion;
	@Column(name = "asm_num_numero_de_expedicion__c")
	private String asm_num_numero_de_expedicion;
	private String casenumber;
	private String type;
	private Date closeddate;
	@Column(name = "nombre__c")
	private String nombre;
	private String description;
	@Column(name = "cola_asignacion__c")
	private String cola_asignacion;
	@Column(name = "n_mero_gestiones_realizadas__c")
	private Double n_mero_gestiones_realizadas;
	private String suppliedemail;
	private String sfid;
	/* inicio se añaden estos campos */
	@Column(name = "id_parcelshop__c")
	private String id_parcelshop;
	@Column(name = "tipificaciones_backoffice__c")
	private String tipificaciones_backoffice;
	private String parentid;
	private String accountid;
	private String suppliedname;
	@Column(name = "codplaza_org__c")
	private String codplaza_org;
	@Column(name = "detractor__c")
	private Boolean detractor;
	@Column(name = "codigo_cliente__c")
	private String codigo_cliente;
	@Column(name = "numeroexpednovalido__c")
	private Boolean numeroexpednovalido;
	@Column(name = "nps__c")
	private Double nps;
	private String sourceid;
	@Column(name = "agencia__c")
	private String agencia;
	@Column(name = "pais_gls__c")
	private String pais_gls;
	@Column(name = "promotor__c")
	private Boolean promotor;
	private String contactemail;
	@Column(name = "formulario_web__c")
	private String formulario_web;
	@Column(name = "codexp__c")
	private String codexp;
	@Column(name = "motivo_de_consulta__c")
	private String motivo_de_consulta;
	/* fin se añaden estos campos */

	
	public Long getId() {
		return id;
	}

	public String getId_parcelshop() {
		return id_parcelshop;
	}

	public void setId_parcelshop(String id_parcelshop) {
		this.id_parcelshop = id_parcelshop;
	}

	public String getTipificaciones_backoffice() {
		return tipificaciones_backoffice;
	}

	public void setTipificaciones_backoffice(String tipificaciones_backoffice) {
		this.tipificaciones_backoffice = tipificaciones_backoffice;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public String getSuppliedname() {
		return suppliedname;
	}

	public void setSuppliedname(String suppliedname) {
		this.suppliedname = suppliedname;
	}

	public String getCodplaza_org() {
		return codplaza_org;
	}

	public void setCodplaza_org(String codplaza_org) {
		this.codplaza_org = codplaza_org;
	}

	public Boolean getDetractor() {
		return detractor;
	}

	public void setDetractor(Boolean detractor) {
		this.detractor = detractor;
	}

	public String getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(String codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public Boolean getNumeroexpednovalido() {
		return numeroexpednovalido;
	}

	public void setNumeroexpednovalido(Boolean numeroexpednovalido) {
		this.numeroexpednovalido = numeroexpednovalido;
	}

	public Double getNps() {
		return nps;
	}

	public void setNps(Double nps) {
		this.nps = nps;
	}

	public String getSourceid() {
		return sourceid;
	}

	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getPais_gls() {
		return pais_gls;
	}

	public void setPais_gls(String pais_gls) {
		this.pais_gls = pais_gls;
	}

	public Boolean getPromotor() {
		return promotor;
	}

	public void setPromotor(Boolean promotor) {
		this.promotor = promotor;
	}

	public String getContactemail() {
		return contactemail;
	}

	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

	public String getFormulario_web() {
		return formulario_web;
	}

	public void setFormulario_web(String formulario_web) {
		this.formulario_web = formulario_web;
	}

	public String getCodexp() {
		return codexp;
	}

	public void setCodexp(String codexp) {
		this.codexp = codexp;
	}

	public String getMotivo_de_consulta() {
		return motivo_de_consulta;
	}

	public void setMotivo_de_consulta(String motivo_de_consulta) {
		this.motivo_de_consulta = motivo_de_consulta;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreagencia() {
		return nombreagencia;
	}

	public void setNombreagencia(String nombreagencia) {
		this.nombreagencia = nombreagencia;
	}

	public String getGls_otrosubtipo() {
		return gls_otrosubtipo;
	}

	public void setGls_otrosubtipo(String gls_otrosubtipo) {
		this.gls_otrosubtipo = gls_otrosubtipo;
	}

	public String getAsm_txt_c_digo_postal_cliente_final() {
		return asm_txt_c_digo_postal_cliente_final;
	}

	public void setAsm_txt_c_digo_postal_cliente_final(String asm_txt_c_digo_postal_cliente_final) {
		this.asm_txt_c_digo_postal_cliente_final = asm_txt_c_digo_postal_cliente_final;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getUltimoestadoenvio() {
		return ultimoestadoenvio;
	}

	public void setUltimoestadoenvio(String ultimoestadoenvio) {
		this.ultimoestadoenvio = ultimoestadoenvio;
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

	public String getCodplaza_dst() {
		return codplaza_dst;
	}

	public void setCodplaza_dst(String codplaza_dst) {
		this.codplaza_dst = codplaza_dst;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}

	public String getSub_tipo() {
		return sub_tipo;
	}

	public void setSub_tipo(String sub_tipo) {
		this.sub_tipo = sub_tipo;
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

	public String getEstadoenvio() {
		return estadoenvio;
	}

	public void setEstadoenvio(String estadoenvio) {
		this.estadoenvio = estadoenvio;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getUltimoestadoincidencia() {
		return ultimoestadoincidencia;
	}

	public void setUltimoestadoincidencia(String ultimoestadoincidencia) {
		this.ultimoestadoincidencia = ultimoestadoincidencia;
	}

	public String getTipo_de_reclamacion() {
		return tipo_de_reclamacion;
	}

	public void setTipo_de_reclamacion(String tipo_de_reclamacion) {
		this.tipo_de_reclamacion = tipo_de_reclamacion;
	}

	public String getAsm_num_numero_de_expedicion() {
		return asm_num_numero_de_expedicion;
	}

	public void setAsm_num_numero_de_expedicion(String asm_num_numero_de_expedicion) {
		this.asm_num_numero_de_expedicion = asm_num_numero_de_expedicion;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCola_asignacion() {
		return cola_asignacion;
	}

	public void setCola_asignacion(String cola_asignacion) {
		this.cola_asignacion = cola_asignacion;
	}

	public Double getN_mero_gestiones_realizadas() {
		return n_mero_gestiones_realizadas;
	}

	public void setN_mero_gestiones_realizadas(Double n_mero_gestiones_realizadas) {
		this.n_mero_gestiones_realizadas = n_mero_gestiones_realizadas;
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
