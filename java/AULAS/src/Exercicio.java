import java.util.Scanner;

public class Exercicio {
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		int anos, meses, dias, idadeEmDias;
		
		System.out.println("Escreva sua idade em anos: ");
		anos = ler.nextInt();
		System.out.println("meses: ");
		meses = ler.nextInt();
		System.out.println("dias: ");
		dias = ler.nextInt();
		
		idadeEmDias = (anos * 365)+(meses * 30)+dias;
		
		System.out.printf("Sua idade em dias é: ", idadeEmDias);

	}
}
