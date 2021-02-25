import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int segundosTotais, horas, minutos, segundos;
		
		System.out.println("Digite o total de segundos trabalhados: ");
		segundosTotais = ler.nextInt();
		
		horas = segundosTotais / 3600;
		minutos = (segundosTotais % 3600) / 60;
		segundos = (segundosTotais % 3600) % 60;
		
		System.out.println("Você trabalhou "+ horas + " horas," + minutos + " minutos e "+segundos + " segundos");
	}

}
