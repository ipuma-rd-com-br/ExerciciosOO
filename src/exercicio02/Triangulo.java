package exercicio02;

public class Triangulo {

	
	private int base, altura,area;
	
	
 public Triangulo() {};
 
 public Triangulo(int base, int altura) {
	 
	this.base = base; 
	this.altura = altura;
	 
 }
	
	
 public int calculaArea() {
	 
	 area =(base * altura)/2;
	 
	 return area;
	 
 }
	
	
}
