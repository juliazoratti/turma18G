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
		System.out.printf("A televis�o est� ligada.");
	}
	public void desligada () {
		
		this.ligar = false;
		System.out.println("A televis�o est� desligada.");
	}
	
	public void volume (int volume) {
		if (volume == 0) {
			System.out.println("O volume est� no mudo.");
		}
		if (volume > 0 && volume <= 6) {
			System.out.println("O volume est� moderado.");
		}
		if (volume >= 7 && volume <= 9) {
			System.out.println("O volume est� alto.");
		}
		if (volume == 10) {
			System.out.println("O volume est� no m�ximo.");
		}
	}
	
}