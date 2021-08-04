package com.pe.estec.util;

/**
 * Clase para utilitarios de tipo string
 * @author Lizandro Alipazaga
 *
 */
public class UtilString {
	private static final String CADENA_TILDE_N = "&Ntilde;";
	private static final String PATRON_TILDE_N = "Ñ";
	
	private static final String CADENA_TILDE_NM = "&ntilde;";
	private static final String PATRON_TILDE_NM = "ñ";
	
	/**
	 * Método que remplaza los caracteres especiales de tipo &xtilde;
	 * @param cadena Elemento al que se le reemplazará los caracteres
	 * @return Regresa el mismo parametro de entrada con los caracteres reemplazados.
	 */
	public static String reemplazaCaracteres(String cadena){
		cadena.replace(CADENA_TILDE_NM, PATRON_TILDE_NM).replace(CADENA_TILDE_N, PATRON_TILDE_N);
		
		return cadena;
	}
}
