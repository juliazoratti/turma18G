package POLIMORFISMO;

public class Preguica extends Animal{
	

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	
	public void movimento () {
		System.out.println("subir em árvores");
	}
	
	public void som () {
		System.out.println("hummmm");
	}

}
