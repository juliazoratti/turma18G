package LacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero, soma = 0, media = 0, quantidade = 0, multiplos =0;
		
		do {
			System.out.println("Escreva um número: ");
			numero = ler.nextInt();
			
			if (numero % 3 ==0) {
				quantidade ++;
				soma = soma + numero;
				media = soma / quantidade;
			}
			
		}
		while (numero != 0); {
			System.out.println("A soma dos numeros que são multiplos de 3 é: "+media);
		}

	}

}
