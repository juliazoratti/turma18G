import java.util.Scanner;

public class Exercicio4Lacos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("Escreva um n�mero e direi se � par ou �mpar: ");
		numero = ler.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("Esse numero � par.");
		}
		else {
			System.out.println("Esse n�mero � �mpar.");
		}

	}

}
