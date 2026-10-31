package atividade_heranca_funcionario;

public class FuncionarioCLT extends Funcionario{
	
	public FuncionarioCLT (String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	public void calcularSalario() {
		salarioFinal = salarioBase - (salarioBase * 0.08);
	}
	public void exibirSalario () {
		super.exibirSalario();
		
	}
	

}
