package ARRAYS;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int valores [][] = new int [3][3];
		int soma = 0, somaD = 0, somaDaDiagonal =0;
		
		for (int l = 0; l < valores.length; l++) {
			for (int c = 0; c <valores.length; c++) {
					System.out.print("Escreva o valor: ");
					System.out.println();
					valores [l][c] = leia.nextInt();
					soma = soma + valores [l][c];
			}
		}
		for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (l == c) {
                    somaDaDiagonal = somaDaDiagonal + valores [l][c];
                }
            }
		}
		System.out.println("A soma é " + soma);
		System.out.println("diagonal" + somaDaDiagonal);
		}

}
