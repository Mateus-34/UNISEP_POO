package ex_02;

public class Pais {
	// Atributos
	private String codigo;
	private String nome;
	private int populacao;
	private double dimensao;

	// construtores

	Pais(String codigo, String nome, double dimensao, int populacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;
		this.populacao = populacao;
	}

	// metodos
	public void ListarPais() {

		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome:" + this.nome);
		System.out.println("Populacao:" + this.populacao);
		System.out.println("Dimensao:" + this.dimensao);
		System.out.println("");
	}
//açoes
	public String getNome() {
		return this.nome;

	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getCodigo() {
		return this.codigo;
		
	}
	
	public void setCodigo(String nome) {
		this.nome = codigo;
		
		}
	
	public int getPopulacao() {
		return this.populacao;
		
		}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
		
		
	}
	
	
	
}
