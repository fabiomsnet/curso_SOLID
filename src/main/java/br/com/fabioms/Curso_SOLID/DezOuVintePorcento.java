package br.com.fabioms.Curso_SOLID;

public class DezOuVintePorcento  implements RegraDeCalculo{

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}