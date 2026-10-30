package atividade_heranca_calculadora_2;

public class Calculadora {
	
	
	double valor1 =0;
	double valor2 =0;
	
	public Calculadora(double valor1, double valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public void soma() {
		
		System.out.println("Executar operacao soma!");
	}
	
	public void subtracao () {
		System.out.println("Executar operacao subtracao!");
	}
	
	public void multiplicacao() {
		System.out.println("Executar operacao Multiplicacao!");
	}
	
	public void divisao() {
		System.out.println("Executar operacao divisao!");
	}
}
