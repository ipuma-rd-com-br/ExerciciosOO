package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
    	
    	Cliente cliente = new Cliente();
    	Funcionario funcionario = new Funcionario();
    	
    	cliente.setNome("Jo�o");
    	cliente.setIdade(27);
    	cliente.setCidadeNasc("S�o Caetano do Sul");
    	
    	cliente.setCpf("410.198.127-09");    	
    	funcionario.setNroMatricula(184885);
    	
    	System.out.println(cliente.exibirDados());
    	System.out.println(funcionario.exibirDados());
    	
    	
    	
    
    }

}
