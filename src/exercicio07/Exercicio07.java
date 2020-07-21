package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {

      Veiculo vei = new Veiculo("Corsinha", 8);
      Veiculo vei2 = new Veiculo("Gol quadrado", 10);
		
		
		vei.abastecer(40);
		vei2.abastecer(35);
		
		vei.autonomia();
		vei2.autonomia();
		
	}

}
