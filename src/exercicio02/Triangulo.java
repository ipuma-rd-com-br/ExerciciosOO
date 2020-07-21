package exercicio02;

public class Triangulo {
	private int base;
	private int altura;
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void calcular() {
		System.out.println((base * altura)/2);
		
	}

}
