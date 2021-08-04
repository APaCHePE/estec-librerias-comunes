package gob.pe.miraflores.comunes.model.bean;

import java.util.List;

public class Log {
	
	public Integer idLog;
	public Integer idTipoEntidad;
	public Integer idEntidad;
	public Integer idEstado;
	public Integer idTipoRegistro;
	public String fechaInicio;
	public String fechaFin;
	public String detalle;
	public String mensaje;
	public String mensajeDetalle;
	public List<Log> listaDetalle;
	
		
	public List<Log> getListaDetalle() {
		return listaDetalle;
	}
	public void setListaDetalle(List<Log> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
	public Integer getIdLog() {
		return idLog;
	}
	public void setIdLog(Integer idLog) {
		this.idLog = idLog;
	}
	public Integer getIdTipoEntidad() {
		return idTipoEntidad;
	}
	public void setIdTipoEntidad(Integer idTipoEntidad) {
		this.idTipoEntidad = idTipoEntidad;
	}
	public Integer getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(Integer idEntidad) {
		this.idEntidad = idEntidad;
	}
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getMensajeDetalle() {
		return mensajeDetalle;
	}
	public void setMensajeDetalle(String mensajeDetalle) {
		this.mensajeDetalle = mensajeDetalle;
	}
	public Integer getIdTipoRegistro() {
		return idTipoRegistro;
	}
	public void setIdTipoRegistro(Integer idTipoRegistro) {
		this.idTipoRegistro = idTipoRegistro;
	}
	
	

}
