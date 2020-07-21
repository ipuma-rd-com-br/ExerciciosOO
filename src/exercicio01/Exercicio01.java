package exercicio01;

public class Exercicio01{
    public static void main(String[] args) {
    	
    	Animal cachorro = new Animal();
    	
    	cachorro.setRaca("Labrador");
    	cachorro.setNome("Spark");
    	cachorro.setIdade(8);
   
    	
    	System.out.println(cachorro.imprime());
     	cachorro.andar();
     	
     	Animal gato = new Animal();
     	
     	gato.setRaca("Persa");
     	gato.setNome("Yuke");
     	gato.setIdade(3);
     	
     	System.out.println(gato.imprime());
     	gato.dormir();
    	
    	
    	
    }

}
