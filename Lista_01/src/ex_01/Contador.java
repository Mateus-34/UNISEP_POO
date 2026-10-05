package ex_01;

public class Contador {

	// Atributos
	private int contador = 0;

	// Metodos

	public void Zerar() {
		this.contador = 0;

	}

	public void Incrementar() {

//	this.contador = this.contador + 1;	faz a mesma coisa que:
		this.contador++;

	}

	public int RetornarValorContador() {
		return this.contador;

	}

}
