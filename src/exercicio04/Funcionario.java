package exercicio04;

public class Funcionario extends Pessoa{

	int numMatricula;
	
	
	public Funcionario() {}

	public Funcionario(String nome, int idade, String cidadeNasc, int numMatricula ) {
		
		this.nome = nome;
		this.idade = idade;
		this.cidadeNasc = cidadeNasc;
		this.numMatricula = numMatricula;
		
	}
	
	
	public String exibirDados() {

		return "Nome: " + this.nome + "\nMatricula: "+ this.numMatricula+ "\nIdade: "+ this.idade + "\nCidade de nascimento: " + this.cidadeNasc +"\n";
	}
}
