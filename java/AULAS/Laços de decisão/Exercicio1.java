import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Digite três números inteiros: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("O número " + num1 + " é o maior da sequência");
		}
		else if (num1 > num3 && num3 > num2) {
			System.out.println("O número " + num1 + " é o maior da sequência");
		}
		else if (num2 > num1 && num1 > num3) {
			System.out.println("O número " + num2 + " é o maior da sequência");
		}
		else if (num2 > num3 && num3 > num1) {
			System.out.println("O número " + num2 + " é o maior da sequência");
		}
		else if (num3 > num1 && num1 > num2) {
			System.out.println("O número " + num3 + " é o maior da sequência");
		}
		else if (num3 > num2 && num2 > num1) {
			System.out.println("O número " + num3 + " é o maior da sequência");
		}
		else {
			System.out.println("Eles são iguais.");
		}

	}

}
