package exercicio04;

public class Funcionario extends Pessoa {
	
	private int nroMatricula;
	
	public void setNroMatricula(int nroMatricula) {
		this.nroMatricula = nroMatricula;
	}
	
	String exibirDados(){
        String dados = "Numero da Matricula: " +this.nroMatricula+"\n";
        return dados;
	}
	

}
