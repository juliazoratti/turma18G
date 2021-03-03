package FUNCOES;

import java.util.Scanner;

public class Numero {
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		int numero = 0, maiorNumero = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			
			if (maiorNumero < numero) {
				
				maiorNumero = numero;
			}
		}
		System.out.println("O meior número é: " + maiorNumero);
	}

}
