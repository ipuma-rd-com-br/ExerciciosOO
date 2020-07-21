package exercicio04;

public class Cliente extends Pessoa {

	String cpf;
	
	public Cliente() {}
	
	public Cliente(String nome, int idade, String cidadeNasc, String cpf ) {
		
		this.nome = nome;
		this.idade = idade;
		this.cidadeNasc = cidadeNasc;
		this.cpf = cpf;
		
	}
	
	
	public String exibirDados() {

		return "Nome: " + this.nome + "\nCPF: "+ this.cpf+ "\nIdade: "+ this.idade + "\nCidade de nascimento: " + this.cidadeNasc +"\n";
	}
	
}
