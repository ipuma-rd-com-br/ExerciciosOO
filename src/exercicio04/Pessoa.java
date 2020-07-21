package exercicio04;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cidadeNasc;
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
		
	}
	public void setCidadeNasc(String cidadeNasc) {
		this.cidadeNasc = cidadeNasc;
	}
	
	String exibirDados(){
        String dados = "Nome: " +this.nome+ "\nIdade: " + this.idade + "\nCidade Nascimento: " +this.cidadeNasc+"\n";
        return dados;
	}
	

}
