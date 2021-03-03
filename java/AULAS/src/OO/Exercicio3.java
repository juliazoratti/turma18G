package OO;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Televisao eletronico = new Televisao ();
		
		char opcao;
		int volume;
		boolean ligar;
		
		eletronico.Televisao("Smart", "Samsung", "prata");
		
		System.out.println("\nDeseja ligar a televisão? s/n ");
		opcao = leia.next().toUpperCase().charAt(0);
		
			if (opcao == 's' || opcao == 'S') {
				eletronico.ligada();
				System.out.println("\nQual o volume da televisão?");
				volume = leia.nextInt();
				
				eletronico.volume(volume);
			}
			else {
				eletronico.desligada();
			}
	}

}
