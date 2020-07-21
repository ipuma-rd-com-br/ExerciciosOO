package exercicio05;

public class Lapis implements Escrita {

	
	
	String ehFeitoDe = "Madeira";
	String escreveCom = "Grafite";
	
	public Lapis() {}

	
	
	@Override
	public String escrever(){
		
		return "Eh feito de: " + this.ehFeitoDe + "\nEscrevendo com: " + this.escreveCom + "\n";
		
	}
	
	
	
	
}
