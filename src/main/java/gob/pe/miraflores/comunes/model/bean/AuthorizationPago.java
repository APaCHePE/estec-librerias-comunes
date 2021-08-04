package gob.pe.miraflores.comunes.model.bean;

public class AuthorizationPago {
	private String codTienda;
	private String codAccion;
	private String codAccionDes;
	private String fechaHora;
	private String fechayHora;
	private String card;
	private String brand;
    private double monto;
    private String moneda;
    
    private String[] recibos;
    
    private String purchaseNumber;
    private String respuesta;
    private String contribEmail;
    private Integer idEntidad;
	public Integer getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(Integer idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getCodTienda() {
		return codTienda;
	}
	public void setCodTienda(String codTienda) {
		this.codTienda = codTienda;
	}
	public String getCodAccion() {
		return codAccion;
	}
	public void setCodAccion(String codAccion) {
		this.codAccion = codAccion;
	}
	public String getCodAccionDes() {
		return codAccionDes;
	}
	public void setCodAccionDes(String codAccionDes) {
		this.codAccionDes = codAccionDes;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getFechayHora() {
		return fechayHora;
	}
	public void setFechayHora(String fechayHora) {
		this.fechayHora = fechayHora;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String[] getRecibos() {
		return recibos;
	}
	public void setRecibos(String[] recibos) {
		this.recibos = recibos;
	}
	public String getPurchaseNumber() {
		return purchaseNumber;
	}
	public void setPurchaseNumber(String purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getContribEmail() {
		return contribEmail;
	}
	public void setContribEmail(String contribEmail) {
		this.contribEmail = contribEmail;
	}
}
