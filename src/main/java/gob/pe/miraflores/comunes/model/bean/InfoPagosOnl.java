package gob.pe.miraflores.comunes.model.bean;

import java.math.BigDecimal;

public class InfoPagosOnl {
	private Integer idInfoPagosOnl;
	private String desModulo;
	private Integer numFecha;
	private Integer numHora;
	private String desPagoDesc;
	private String desNroord;
	private BigDecimal desMonto;
	private String tdi;
	private String con;
	private String nombres;
	private String direccion;
	private String desEmail;
	
	public Integer getIdInfoPagosOnl() {
		return idInfoPagosOnl;
	}
	public void setIdInfoPagosOnl(Integer idInfoPagosOnl) {
		this.idInfoPagosOnl = idInfoPagosOnl;
	}
	public String getDesModulo() {
		return desModulo;
	}
	public void setDesModulo(String desModulo) {
		this.desModulo = desModulo;
	}
	public Integer getNumFecha() {
		return numFecha;
	}
	public void setNumFecha(Integer numFecha) {
		this.numFecha = numFecha;
	}
	public Integer getNumHora() {
		return numHora;
	}
	public void setNumHora(Integer numHora) {
		this.numHora = numHora;
	}
	public String getDesPagoDesc() {
		return desPagoDesc;
	}
	public void setDesPagoDesc(String desPagoDesc) {
		this.desPagoDesc = desPagoDesc;
	}
	public String getDesNroord() {
		return desNroord;
	}
	public void setDesNroord(String desNroord) {
		this.desNroord = desNroord;
	}
	public BigDecimal getDesMonto() {
		return desMonto;
	}
	public void setDesMonto(BigDecimal desMonto) {
		this.desMonto = desMonto;
	}
	public String getTdi() {
		return tdi;
	}
	public void setTdi(String tdi) {
		this.tdi = tdi;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDesEmail() {
		return desEmail;
	}
	public void setDesEmail(String desEmail) {
		this.desEmail = desEmail;
	}
}
