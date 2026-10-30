package atvidade_heranças;

public class Caminhao extends Veiculo {
	
	public int portas;
	
	public Caminhao (String nome, String marca, String modelo, int ano, String cor, int portas) {
	
		super(nome, marca, modelo, ano, cor);
		this.portas = portas;
		}
	
	public void exibirDetalhes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("marca: " + this.marca);
		System.out.println("modelo: " + this.modelo);
		System.out.println("ano: " + this.ano);
		System.out.println("cor: " + this.cor);
		System.out.println("portas: " + this.portas);
	}
	
}
