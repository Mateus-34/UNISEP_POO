package atividade_heranca_funcionario;

public class FuncionarioEstagiario extends Funcionario {
		
	public FuncionarioEstagiario (String nome, double salarioBase) {
		super (nome, salarioBase);
	}
	public void calcularSalario() {
	salarioFinal = salarioBase - (salarioBase *  0.05);
	}
	@Override
	public void exibirSalario () {
		super.exibirSalario();
		
	}

}
