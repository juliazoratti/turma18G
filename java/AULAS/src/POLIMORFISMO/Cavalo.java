package POLIMORFISMO;

public class Cavalo extends Animal{
	

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	public void movimento () {
		System.out.println("correr");
	}
	public void som () {
		System.out.println("Relinchar");
	}


}
