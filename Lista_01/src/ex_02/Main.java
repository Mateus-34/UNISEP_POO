package ex_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pais brasil = new Pais("BRA", "Brasil", 8515767.049, 123456789);
		Pais mexico = new Pais("MEX", "Mexico", 1964375.0, 347862876 );
		Pais paraguai = new Pais("PY", "Paraguai", 406752.0, 83479326);
		//Pais chile = new Pais("")
		
		
		
		
		brasil.getNome();
		brasil.setNome("Brasil brasileiro");
		brasil.getPopulacao();
		brasil.setPopulacao(999999);
		
		
		brasil.ListarPais();
		mexico.ListarPais();
		paraguai.ListarPais();
		
		
		

	}

}
