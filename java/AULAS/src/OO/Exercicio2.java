package OO;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao ();
		Scanner leia = new Scanner (System.in);
		
		char opcao;
		aviao1.Aviao("Boing 77", "LATAM", 66, 5);
		
		System.out.println("\nQuer que o avião decole?");
		opcao = leia.next().toUpperCase().charAt(0);
		
			if (opcao == 's' || opcao == 'S') {
			aviao1.decolar();
			}
			else {
				aviao1.naoDecolar();
			}
	}

}
