
public class Main {

	public static void main(String[] args) {
		Aluno objeto1 = new Aluno("Carlos","123456",800); 
		
		
		
		
		objeto1.imprimir_aluno();

		Aluno objeto2 = new Aluno("Robson", "123457",400);
		
	//	objeto2.nome = "Felipe";
	//	objeto2.ra = "654321";
	//	objeto2.valor_mensalidade = 554;
		
		objeto2.imprimir_aluno();
		
		
		Aluno objeto3 = new Aluno("Pablo","654321",500);
		objeto3.imprimir_aluno();
		
		
	}

}
