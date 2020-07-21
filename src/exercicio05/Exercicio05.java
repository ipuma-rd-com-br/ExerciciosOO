package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
    	
    	Caneta caneta = new Caneta();
    	Lapis lapis = new Lapis();
    	PenaMosquito pena = new PenaMosquito();
    	
    	caneta.setEhFeitoDe("Plastico");
    	caneta.setEscreveCom("Tinta");
    	
    	lapis.setEhFeitoDe("Madeira");
    	lapis.setEscreveCom("Grafite");
    	
    	pena.setEhFeitoDe("Metal");
    	pena.setEscreveCom("Nanquim");
    	
    	System.out.println(caneta.escrever());
    	System.out.println(lapis.escrever());
    	System.out.println(pena.escrever());
    	


    	
    }

}
