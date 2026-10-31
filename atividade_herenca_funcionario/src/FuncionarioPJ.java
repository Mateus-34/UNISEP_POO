package atividade_heranca_funcionario;

public class FuncionarioPJ extends Funcionario {
	public FuncionarioPJ(String nome, double salarioBase) {
		super (nome, salarioBase);
	}
	public void calcularSalario () {
	salarioFinal = salarioBase + (salarioBase *  0.15);
	}
	public void exibirSalario() {
		super.exibirSalario();
		
	}

}
