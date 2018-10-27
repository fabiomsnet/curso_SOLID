package br.com.fabioms.Curso_SOLID;

public class App {

	public static void main(String[] args) {

		Funcionario func = new Funcionario();
		CalculadoraDeSalario calc = new CalculadoraDeSalario();

		func.setNome("Fábio Moreira da Silva");
		func.setCargo(Cargo.DESENVOLVEDOR);
		func.setSalarioBase(4000.00);

		System.out.println("Funcionário: " + func.getNome());
		System.out.println("Salario: " + func.getSalarioBase() + " + " + (func.getSalarioBase() - calc.calcula(func)));
	}
}
