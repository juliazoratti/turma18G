package OO;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int b1, b2, b3, h1, h2, h3;
		double a1, a2, a3, a, maior = 0, triangulo =0;
		
		System.out.println("Digite a base do Tri�ngulo 1: ");
		b1 = leia.nextInt();
		System.out.println("Digite a altura do Tri�ngulo 1: ");
		h1 = leia.nextInt();
		System.out.println("Digite a base do Tri�ngulo 2: ");
		b2 = leia.nextInt();
		System.out.println("Digite a altura do Tri�ngulo 2: ");
		h2 = leia.nextInt();
		System.out.println("Digite a base do Tri�ngulo 3: ");
		b3 = leia.nextInt();
		System.out.println("Digite a altura do Tri�ngulo 3: ");
		h3 = leia.nextInt();
		
		a1 = (b1 * h1) / 2;
		a2 = (b2 * h2) / 2;
		a3 = (b3 * h3) / 2;
		
		a = a1;
		a = a2;
		a = a3;
		
		if (a > maior) {
			maior = a;
		}
		
		System.out.println("A base do Tri�ngulo 1 � " + b1 + ", " + h1 + " de altura e " + a1 + " de �rea.");
		System.out.println("A base do Tri�ngulo 2 � " + b2 + ", " + h2 + " de altura e " + a2 + " de �rea.");
		System.out.println("A base do Tri�ngulo 3 � " + b3 + ", " + h3 + " de altura e " + a3 + " de �rea.");
		System.out.println("A maior �rea �: " + maior);
	}

}
