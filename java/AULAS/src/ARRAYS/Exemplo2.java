package ARRAYS;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int lancamentos [] = new int [3];
		int maiorPontuacao = 0, vezesMaior = 0;
		double media = 0, soma = 0;
		
		for (int x = 0; x < lancamentos.length; x++) {
			System.out.println("Digite o valor do lançamento: ");
			lancamentos [x] = leia.nextInt();
			
			soma = soma + lancamentos[x];
			media = soma / 3;
			
			if (maiorPontuacao <= lancamentos[x]) {
				if (maiorPontuacao < lancamentos[x]) {
					vezesMaior = 0;
				}
				maiorPontuacao = lancamentos[x];
				vezesMaior ++;
			}
		}
		System.out.printf("A maior ponuação é %d e a media dos lançamentos é %.2f e apareceu %d vezes", maiorPontuacao,media, vezesMaior);
	}

}
