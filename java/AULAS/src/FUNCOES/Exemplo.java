package FUNCOES;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int tamanho; 
		
		System.out.println("Escreva o tamanho da linha: ");
		tamanho = ler.nextInt();
		
		for (int x = 0; x<tamanho; x++) {
			linha(tamanho);
		}
		
	}
	public static void linha (int tamanho){
		System.out.print("-");
	}

}
