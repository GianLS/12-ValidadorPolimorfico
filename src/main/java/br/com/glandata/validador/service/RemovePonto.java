package br.com.glandata.validador.service;

public class RemovePonto extends Formatador {
	@Override
	public String remove(String texto) {
		return texto.replaceAll("\\.", "");
	}
}
