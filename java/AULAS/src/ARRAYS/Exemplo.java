package ARRAYS;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valores []= new int [5];
		int maior = 0, vezes =0;
		
		for (int x = 0; x < 5; x++) {
			System.out.println("Digite o valor: ");
			valores[x] = ler.nextInt();
			
			if (valores [x] >= maior) {
				if (valores [x]> maior) {
					vezes = 0;
				}
				
				maior = valores [x];
				vezes ++;
			}
		}
		
		System.out.println("O maior valor é: " + maior + "E aparece " + vezes + "Vezes");

	}

}
