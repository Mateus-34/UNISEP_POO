
public class Aluno {
	
	//Atributos
	String nome;
	String ra;
	float valor_mensalidade;
	
	//Construtores
	//public Aluno() {
	//	this.nome = "NOME NAO PREENCHIDO";
	//	this.ra = "RA NAO PREENCHIDO";
	//	this.valor_mensalidade = 0;
		
	//	}
	
	public Aluno(String nome, String ra, float valor_mensalidade) {
	this.nome = nome;
	this.ra = ra;
	this.valor_mensalidade = valor_mensalidade;
		
		
		
	}
	
	
	
	//Metodos
	public void imprimir_aluno() {
		
		System.out.println("Nome do ALuno: " + this.nome);
		System.out.println("RA do ALuno: " + this.ra);
		System.out.println("Valor da mensalidade: " + this.valor_mensalidade);
		System.out.println("-------------------");
	}
		
}
