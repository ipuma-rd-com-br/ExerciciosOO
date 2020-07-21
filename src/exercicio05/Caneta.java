package exercicio05;

public class Caneta implements Escrita {

	String ehFeitoDe = "Plastico";
	String escreveCom = "Tinta";
	
	public Caneta() {}
	
	public Caneta(String ehFeitoDe, String escreveCom) {
		this.ehFeitoDe = ehFeitoDe;
		this.escreveCom = escreveCom;

	}
	
	
	
	
	@Override
	public String escrever(){
		
		return "Eh feito de: " + this.ehFeitoDe + "\nEscrevendo com: " + this.escreveCom + "\n";
		
	}
	
	
	
}
