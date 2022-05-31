package br.com.glandata.validador.service;

public class RemoveVirgula extends Formatador {

	@Override
	public String remove(String texto) {
		return texto.replaceAll(",", "");
	}
}
