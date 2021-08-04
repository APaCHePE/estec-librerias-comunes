package gob.pe.miraflores.comunes.model.bean;

import java.util.Map;

public class CallRpg {
	private String esquema;
	private String programa;
	private Map<String, Object> parametros;
	
	public String getEsquema() {
		return esquema;
	}
	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public Map<String, Object> getParametros() {
		return parametros;
	}
	public void setParametros(Map<String, Object> parametros) {
		this.parametros = parametros;
	}
}
