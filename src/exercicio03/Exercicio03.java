package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {


	Livro l1 = new Livro("Uma historia qualquer", "Bruno pereira", 150);
	Livro l2 = new Livro("Alguem ja leu esse livro?", "Marcelo Alves", 300);	
	Livro l3 = new Livro("Interessante", "Andre Pires", 250);	
		
	System.out.println(l1.imprimirLivros());
	System.out.println(l2.imprimirLivros());	
	System.out.println(l3.imprimirLivros());
	
	
	}

}
