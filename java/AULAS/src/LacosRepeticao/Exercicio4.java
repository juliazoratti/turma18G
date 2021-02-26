package LacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade=0, estado=0, c = 0, sexo=0,c1 = 0, c2=0, c3=0, c4=0, c5=0, c6= 0;
		
		for (int x = 1; x<=5; x++) {
			System.out.println("Diga sua idade: ");
			idade = ler.nextInt();
			System.out.println("Diga seu genero: 1- Feminino, 2-Masculino e 3- Outros");
			sexo = ler.nextInt();
			System.out.println("Você se considera: 1- calma, 2- nervosa ou 3- agressiva?");
			estado = ler.nextInt();
		}
		if (estado == 1) {
			c1++;
		}
		if (sexo == 1 && estado == 2) {
			 c2++;
		}
		if (sexo == 2 && estado == 3) {
			c3++;
		}
		if (sexo == 3 && estado == 1) {
			c4++;
		}
		if (idade >= 40 && estado == 2) {
			c5 ++;
		}
		if (idade <= 18 && estado == 1) {
			c6++;
		}
		
		System.out.println("Pessoas calmas: " + c1);
		System.out.println("Mulheres nervosas: " + c2);
		System.out.println("Homens agressivos: " + c3);
		System.out.println("Outros calmos: " + c4);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + c5);
		System.out.println("Pessoas calmas com menos de 18 anos: " + c6);
		
		

	}

}
