package gob.pe.miraflores.comunes.model.bean;

import java.util.List;

public class PideAntecedentes {
	
	private String numDoc;
	private String nombres;
	private String aPaterno;
	private String aMaterno;
	private String cPersona;
	
	private String nombreCompleto;
	private String tipoDoc;
	private String sexo;
	private String talla;
	private String contextura;
	private String fecNacimiento;
	private String lugarNacimiento;
	private String nombPadre;
	private String nombMadre;
	private String antecedente;		
	private String correoUsuario;	
	private String numDocLogueado;	
	private Integer tipoConsulta;
	private String respuesta;
	
	
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Integer getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(Integer tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public String getNumDocLogueado() {
		return numDocLogueado;
	}
	public void setNumDocLogueado(String numDocLogueado) {
		this.numDocLogueado = numDocLogueado;
	}
	public String getCorreoUsuario() {
		return correoUsuario;
	}
	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getContextura() {
		return contextura;
	}
	public void setContextura(String contextura) {
		this.contextura = contextura;
	}
	public String getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getNombPadre() {
		return nombPadre;
	}
	public void setNombPadre(String nombPadre) {
		this.nombPadre = nombPadre;
	}
	public String getNombMadre() {
		return nombMadre;
	}
	public void setNombMadre(String nombMadre) {
		this.nombMadre = nombMadre;
	}
	public String getAntecedente() {
		return antecedente;
	}
	public void setAntecedente(String antecedente) {
		this.antecedente = antecedente;
	}
	private List<PideAntecedentes> listaAntecedente;
	
	
	public List<PideAntecedentes> getListaAntecedente() {
		return listaAntecedente;
	}
	public void setListaAntecedente(List<PideAntecedentes> listaAntecedente) {
		this.listaAntecedente = listaAntecedente;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getcPersona() {
		return cPersona;
	}
	public void setcPersona(String cPersona) {
		this.cPersona = cPersona;
	}
		
}
