package LacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero = 0, soma = 0;
		
		do {
		System.out.println("Escreva um numero: ");
		numero = ler.nextInt();
		soma=soma+numero;
		}
		while ( numero != 0);{
			System.out.println("A soma dos números é: "+ soma);
		}
	}
}
		
		
