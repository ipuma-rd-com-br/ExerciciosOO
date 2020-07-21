package exercicio03;

public class Livro {

	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, int numeroPaginas ) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		
	}
	
	public String imprimirLivros() {
		
		return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nNumero de Paginas: " + numeroPaginas+ "\n";
		
		
	}
	
}
