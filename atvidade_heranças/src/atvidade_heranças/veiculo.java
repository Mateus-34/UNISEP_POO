package atvidade_heranças;

public class Veiculo {
	String nome;
	String marca;
	String modelo;
	int ano;
	String cor;
	
	
	public Veiculo (String nome, String marca, String modelo, int ano, String cor){ 
	this.nome = nome;	
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
	this.cor = cor;
			}
	
	public void exibirDados () {
		
		System.out.println("nome: " + this.nome);
		System.out.println("marca:" + this.marca);
		System.out.println("modelo:" + this.modelo);
		System.out.println("ano:" + this.ano);
		System.out.println("cor:" + this.cor);
		System.out.println("");
		
	}
	
	
	
	
	
	
	
}
