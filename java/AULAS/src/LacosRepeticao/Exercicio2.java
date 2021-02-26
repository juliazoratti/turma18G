package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int numero, par = 0, impar=0;
		
		for (int x = 1; x<= 10; x++) {
			System.out.println("Escreva um número: ");
			numero = ler.nextInt();

			
			if (numero % 2 ==0) {
				
				par ++;
				
				
			}
			else {
				
				impar ++;
				
			
				}
		}
			System.out.println("Você escreveu " + par + " numeros pares.");
			System.out.println("voce escreveu " + impar + "numeros impares.");
		
	}

}
