package OO;

public class Televisao {
	
	private String fabricante;
	private String modelo;
	private String cor;
	private int volume;
	private boolean ligar;
	
	public void Televisao (String modelo, String fabricante, String cor) {
		System.out.printf("A televisao do modelo %s, do fabricante %s e da cor %s.", modelo, fabricante, cor);
	}
	
	public void ligada () {
		
		this.ligar = true;
		System.out.printf("A televisão está ligada.");
	}
	public void desligada () {
		
		this.ligar = false;
		System.out.println("A televisão está desligada.");
	}
	
	public void volume (int volume) {
		if (volume == 0) {
			System.out.println("O volume está no mudo.");
		}
		if (volume > 0 && volume <= 6) {
			System.out.println("O volume está moderado.");
		}
		if (volume >= 7 && volume <= 9) {
			System.out.println("O volume está alto.");
		}
		if (volume == 10) {
			System.out.println("O volume está no máximo.");
		}
	}
	
}