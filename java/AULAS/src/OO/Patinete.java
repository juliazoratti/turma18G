package OO;

public class Patinete {
	private String tipo;
	private String cor;
	private double velocidade;
	private double velocidadeAtual;
	private double total;
	
	public void Patinete (String tipo, String cor, double velocidadeAtual) {
		System.out.printf("Esse patinete %s é da cor %s. Sua velocidade atual é de %.2f km/h.", tipo, cor, velocidadeAtual);
	}
	
	public void velocidade (double velocidade) {
		
		total = velocidadeAtual + velocidade;
		
		System.out.printf("Sua velocidade atual é de " + total + " km/h.");
		
	}
}
