package gob.pe.miraflores.comunes.model.bean;

import java.util.Date;

public class RecuperaPass {
	private Integer idRecuperapass;
	private String desModulo;
	private Date fecProceso;
	private String desEmail;
	private String desCodRef;
	private String desNuevopass;
	private Integer indEstado;
	
	public Integer getIdRecuperapass() {
		return idRecuperapass;
	}
	public void setIdRecuperapass(Integer idRecuperapass) {
		this.idRecuperapass = idRecuperapass;
	}
	public String getDesModulo() {
		return desModulo;
	}
	public void setDesModulo(String desModulo) {
		this.desModulo = desModulo;
	}
	public Date getFecProceso() {
		return fecProceso;
	}
	public void setFecProceso(Date fecProceso) {
		this.fecProceso = fecProceso;
	}
	public String getDesEmail() {
		return desEmail;
	}
	public void setDesEmail(String desEmail) {
		this.desEmail = desEmail;
	}
	public String getDesCodRef() {
		return desCodRef;
	}
	public void setDesCodRef(String desCodRef) {
		this.desCodRef = desCodRef;
	}
	public String getDesNuevopass() {
		return desNuevopass;
	}
	public void setDesNuevopass(String desNuevopass) {
		this.desNuevopass = desNuevopass;
	}
	public Integer getIndEstado() {
		return indEstado;
	}
	public void setIndEstado(Integer indEstado) {
		this.indEstado = indEstado;
	}
}
