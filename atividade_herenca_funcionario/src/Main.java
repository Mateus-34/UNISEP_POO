package atividade_heranca_funcionario;

public class Main {

	public static void main(String[] args) {
		
		FuncionarioCLT guilherme = new FuncionarioCLT ("Gulherme", 1639);
		guilherme.calcularSalario();
		guilherme.exibirSalario(); 
		
		FuncionarioPJ fabiano = new FuncionarioPJ ("Fabiano", 3600.76);
		fabiano.calcularSalario();
		fabiano.exibirSalario();
		
		FuncionarioEstagiario jones = new FuncionarioEstagiario ("Jones", 2000);
		jones.calcularSalario();
		jones.exibirSalario();
		

	}

}
