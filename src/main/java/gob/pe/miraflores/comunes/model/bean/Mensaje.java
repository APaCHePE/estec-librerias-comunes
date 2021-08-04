package gob.pe.miraflores.comunes.model.bean;

import java.util.List;

import lombok.Data;

@Data
public class Mensaje {
	private CuentaMensaje cuentaRemitente;
	private CuentaMensaje cuentaDestino;
	private List<CuentaMensaje> cuentaDestinovm;

	private List<CuentaMensaje> cuentaCopia;
	private List<CuentaMensaje> cuentaOculta;

	private CuentaMensaje cuentaRespuesta;

	private String mensajeAsunto;

	private String mensajeContenido;

	private List<FileAdjunto> mensajeFileAdjunto;

	private boolean configSiHtml;

	private String aplicacionEnvio;

}