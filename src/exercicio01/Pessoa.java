package exercicio01;

public class Pessoa {

	private String nome;
	private double altura;
	private int idade;
	
	public Pessoa() {}
	
	public Pessoa(String nome, double altura, int idade) {
		
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		
	}
		
	void falar(){
			
		System.out.println( "Meu nome eh: " + this.nome);

		}
	
	
	void andar() {
		
		System.out.println("Estou andando");
		
	}
		
		
		
	}
	

