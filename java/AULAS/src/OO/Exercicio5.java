package OO;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Patinete patinete = new Patinete ();
		
		double resposta;
		
		patinete.Patinete("el�trico", "preto", 0);
		
		System.out.println("\nQual a velocidade que o patinete est� no momento?");
		resposta = leia.nextDouble();
		
		patinete.velocidade(resposta);

	}

}
