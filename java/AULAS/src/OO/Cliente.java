package OO;

public class Cliente {
	public String nome, sobrenome;
	public String cpf;
	public int idade;
	
	public void Cliente (String nome, String sobrenome, String cpf, int idade) {
		System.out.printf("Seu nome é %s %s, tem %d anos e o CPF: %s.", nome, sobrenome, idade, cpf);
	}
}
