package br.com.fabioms.Curso_SOLID;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}
}
