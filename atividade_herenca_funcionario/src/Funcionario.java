package atividade_heranca_funcionario;

public class Funcionario {
	
	protected String nome;
	protected double salarioBase;
	protected double salarioFinal;
	
	
	public Funcionario (String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	
	public void calcularSalario() {
		
	}
	public void exibirSalario() {
		System.out.println("Nome :" + this.nome);
		System.out.println("Salario final: " + this.salarioFinal);
		System.out.println("Salario base: " + salarioBase);
	}
	
	
	

}
