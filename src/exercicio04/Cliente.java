package exercicio04;

public class Cliente extends Pessoa {
	private String cpf;
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	String exibirDados(){
        String dados = "Numero CPF: " +this.cpf+"\n";
        return dados;

	}
}
