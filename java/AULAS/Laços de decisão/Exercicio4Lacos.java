import java.util.Scanner;

public class Exercicio4Lacos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("Escreva um número e direi se é par ou ímpar: ");
		numero = ler.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("Esse numero é par. E sua raiz quadrada é: " + Math.sqrt(numero));
		}
		else {
			System.out.println("Esse número é ímpar. Seu quadrado é: " + Math.pow(numero, 2));
		}

	}

}
