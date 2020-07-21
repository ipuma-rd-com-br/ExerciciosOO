package exercicio07;

public class Veiculo {
	
	private String nome;
	private int numRodas;
	private int capTanque;
	private int consumo;
	
	
	public Veiculo() {}
	
	public Veiculo(String nome, int consumo) {
		this.nome = nome;
		this.consumo = consumo;
	
	}
	
	void abastecer(int capTanque) {
		
		this.capTanque = capTanque;
		
		
	}
	
	void autonomia() {
		
		int total = this.consumo * capTanque;
		
		System.out.println("O " + this.nome+ " pode percorrer uma distância de " + total + "Km");
		
	}
	
	
	

}
