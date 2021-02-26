package LacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade=0, menos=0, mais=0;
		
		
		while (idade != -99) {
			System.out.println("Escreva sua idade: ");
			idade = ler.nextInt();
			
			if (idade < 21) {
				menos++;
			}
			else if (idade > 50) {
				mais++;
			}
		}
		
		System.out.println("Numero de pessoas com menos de 21 anos: " + menos);
		System.out.println("Numero de pessoas com mais de 50 anos: "+ mais);

	}

}
