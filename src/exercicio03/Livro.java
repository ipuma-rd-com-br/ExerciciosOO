package exercicio03;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	String imprime(){
        String dados = "T�tulo: " +this.titulo+ "\nAutor: " + this.autor + "\nP�ginas: " +this.numeroPaginas+"\n";
        return dados;
	}
	

}
