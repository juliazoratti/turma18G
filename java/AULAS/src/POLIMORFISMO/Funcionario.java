package POLIMORFISMO;

public class Funcionario {
	
	private String nome;
	private int matricula;
	protected int horasTrabalhadas;
	protected double valorPorHora;
	
	//construtor
	public Funcionario(String nome, int matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
		
	}
	
	//encapsulamento
	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public String getNomeString() {
		return nome;
	}

	public void setNomeString(String nomeString) {
		this.nome = nomeString;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	//metodos
	public double salario () {
		return (horasTrabalhadas * valorPorHora);
	}
	public double salario (double imposto) {
		return (horasTrabalhadas * valorPorHora) - ((horasTrabalhadas * valorPorHora) * imposto);
	}

}