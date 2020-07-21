package exercicio05;

public class PenaMosquito implements Escrita {

	
	
	String ehFeitoDe = "Metal";
	String escreveCom = "Nanquim";
	
	public PenaMosquito() {}
	


	@Override
	public String escrever(){
		
		return "Eh feito de: " + this.ehFeitoDe + "\nEscrevendo com: " + this.escreveCom + "\n";
		
	}
	
	
	
	
	
	
	
	
	
	
}
