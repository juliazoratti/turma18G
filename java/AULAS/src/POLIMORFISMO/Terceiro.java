package POLIMORFISMO;

public class Terceiro extends Funcionario{
	
	private double adicional;
	
	//construtor
	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora) {
		super(nome, matricula, horasTrabalhadas, valorPorHora);
	
	}
	//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	//metodo
	@Override
	public double salario () {
		return ((horasTrabalhadas * valorPorHora) + adicional);
	}
}
