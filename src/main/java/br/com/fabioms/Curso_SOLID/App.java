package br.com.fabioms.Curso_SOLID;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Fatura fatura = new Fatura();
		GeradorDeNotaFiscal gnf = new GeradorDeNotaFiscal(EnviadorDeEmail);
		
		fatura.setCliente("Fábio Moreira da Sivla");
		fatura.setValorMensal(30.00);
		
		System.out.println(gnf.gera(fatura));
		
		
	}
}
