package POLIMORFISMO;

public class Cachorro extends Animal{


	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public void movimento () {
		System.out.println("correr");
	}
	public void som () {
		System.out.println("AU AU");
	}


}
