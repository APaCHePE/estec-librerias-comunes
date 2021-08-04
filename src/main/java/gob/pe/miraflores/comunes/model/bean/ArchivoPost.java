package gob.pe.miraflores.comunes.model.bean;

import java.sql.Date;

public class ArchivoPost {
	
    private long idArchivoEntidad;
	
	private int idTipoEntidad;
	
	private int idEntidad;
	
	private String nombreArchivo;
	
	private boolean flagPrincipal;
	
	private int version;
	
	private int versionActual;
	
	private String usaurioCreador;
	
	private Date fechaCreacion;
	
	private String usuarioModificador;
	
	private Date fechaModificacion;
	
	private String archivo;
	
	private String extension;	

	private String urlAuxiliar;
	
	private int estado;
	
	private int idEntidadArchivo;

	public int getIdEntidadArchivo() {
		return idEntidadArchivo;
	}

	public void setIdEntidadArchivo(int idEntidadArchivo) {
		this.idEntidadArchivo = idEntidadArchivo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public long getIdArchivoEntidad() {
		return idArchivoEntidad;
	}

	public void setIdArchivoEntidad(long idArchivoEntidad) {
		this.idArchivoEntidad = idArchivoEntidad;
	}

	public int getIdTipoEntidad() {
		return idTipoEntidad;
	}

	public void setIdTipoEntidad(int idTipoEntidad) {
		this.idTipoEntidad = idTipoEntidad;
	}

	public int getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public boolean isFlagPrincipal() {
		return flagPrincipal;
	}

	public void setFlagPrincipal(boolean flagPrincipal) {
		this.flagPrincipal = flagPrincipal;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getVersionActual() {
		return versionActual;
	}

	public void setVersionActual(int versionActual) {
		this.versionActual = versionActual;
	}

	public String getUsaurioCreador() {
		return usaurioCreador;
	}

	public void setUsaurioCreador(String usaurioCreador) {
		this.usaurioCreador = usaurioCreador;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioModificador() {
		return usuarioModificador;
	}

	public void setUsuarioModificador(String usuarioModificador) {
		this.usuarioModificador = usuarioModificador;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public String getUrlAuxiliar() {
		return urlAuxiliar;
	}

	public void setUrlAuxiliar(String urlAuxiliar) {
		this.urlAuxiliar = urlAuxiliar;
	}

}

