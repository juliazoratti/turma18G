package OO;

public class Funcionario {
	
	private String nome;
	private String empresa;
	private String genero;
	private char turno;
	private int idade;
	
	public void funcionario (String nome, String genero, int idade, String empresa) {
		System.out.printf("O funcionario %s, do genero %s, %d anos e da empresa %s", nome, genero, idade, empresa);
	}
	
	public void turno (char turno) {
		if (turno == 'm'|| turno == 'M') {
			System.out.println("Seu turno começa 06:00.");
		}
		else if (turno == 'v' || turno == 'V') {
			System.out.println("Seu turno começa 12:00.");
		}
		else if (turno == 'N' || turno == 'n') {
			System.out.println("Seu turno começa 18:00.");
		}
		else {
			System.out.println("Turno invalido. Tente respostas como: matutino, vespertino ou noturno.");
		}
	}

}
