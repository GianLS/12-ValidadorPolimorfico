package br.com.glandata.validador.service;

public class Formatador {
	public String remove(String texto) {
		return null;
	};
	
	public static String removePonto(String texto) {
		return texto.replaceAll("\\.", "");
	}
	
	public static String removeTraco(String texto) {
		return texto.replaceAll("-", "");
	}
}
