package com.pe.estec.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {
	private int codigo;
	private String descripcion;
	private List<FieldCustomError> errores;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<FieldCustomError> getErrores() {
		return errores;
	}
	public void setErrores(List<FieldCustomError> errores) {
		this.errores = errores;
	}
	@Override
	public String toString() {
		return "ErrorResponse [codigo=" + codigo + ", descripcion=" + descripcion + ", errores=" + errores + "]";
	}
}
