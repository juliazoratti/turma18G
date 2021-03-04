package POLIMORFISMO;

public class Cachorro extends Animal{
	
	Animal cachorro = new Animal ("Rex", 5, "Au");
	
	private String movimento;

	public Cachorro(String nome, int idade, String som, Animal cachorro) {
		super(nome, idade, som);
		this.cachorro = cachorro;
	}

	public Animal getCachorro() {
		return cachorro;
	}

	public void setCachorro(Animal cachorro) {
		this.cachorro = cachorro;
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
	public void movimento () {
		return "Andar";
	}

}
