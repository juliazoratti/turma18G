import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double notaA, notaB, notaC, media;
		
		System.out.println("Escreva o valor da sua primeira nota: ");
		notaA = ler.nextDouble();
		System.out.println("Escreva o valor da sua segunda nota: ");
		notaB = ler.nextDouble();
		System.out.println("Escreva o valor da sua terceira nota: ");
		notaC = ler.nextDouble();
		
		media = ((notaA * 2) + (notaB * 3) + (notaC *5)) / 3;
		
		System.out.println("A sua média final é: " + media);

	}

}
