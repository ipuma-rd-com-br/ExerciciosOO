package exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
	
	
	Livro dracula = new Livro(); 
		
		dracula.setTitulo("Drácula");
		dracula.setAutor("Bram Stoker");
		dracula.setNumeroPaginas(576);
		
    	System.out.println(dracula.imprime());
		
	Livro  algernon = new Livro();
	
		algernon.setTitulo("Flores para Algernon");
		algernon.setAutor("Daniel Keyes");
		algernon.setNumeroPaginas(284);
    	System.out.println(algernon.imprime());
	
	Livro clarke = new Livro();
	
		clarke.setTitulo("Galeria Clarke");
		clarke.setAutor("diversos");
		clarke.setNumeroPaginas(220);
    	System.out.println(clarke.imprime());

	
		
		
		
	

    }
}
