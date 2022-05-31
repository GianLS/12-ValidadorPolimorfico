package br.com.glandata.validador;

import br.com.glandata.validador.service.Formatador;
import br.com.glandata.validador.service.RemovePonto;
import br.com.glandata.validador.service.RemoveTraco;
import br.com.glandata.validador.service.RemoveVirgula;

public class App {
	public static void main(String[] args) {
		String texto = "nome-do-projeto:glandata.validador,";
		
		String csv = "ABC;RUA DOS BOBOS; 123 0 456 ";
		
		String[] dadosUsuario = csv.split(";");
		
		String nome = dadosUsuario[0];
		String endereco = dadosUsuario[1];
		String numero = dadosUsuario[2];
		
		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(numero);
		
		Formatador removedorTraco = new RemoveTraco();
		System.out.println(removedorTraco.remove(texto));
		
		Formatador removedorPonto = new RemovePonto();
		System.out.println(removedorPonto.remove(texto));
		
		Formatador removedorVirgula = new RemoveVirgula();
		System.out.println(removedorVirgula.remove(texto));
		
		System.out.println(Formatador.removeTraco(Formatador.removePonto(texto)));
	}
}
