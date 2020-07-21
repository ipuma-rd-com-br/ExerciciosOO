package exercicio01;

public class Animal {
	private String raca;
	private String nome;
	private int idade;
		

	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void andar() {
		System.out.println("...Andando...");
	}
	
	public void dormir() {
		System.out.println("zZZZzzZZzZzzZzz");
	}
	
	String imprime(){
        String dados = "Nome: " +this.nome+ "\nraça: " + this.raca + "\nidade: " +this.idade+"\n";
        return dados;
	}


}
