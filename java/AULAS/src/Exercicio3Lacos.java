import java.util.Scanner;

public class Exercicio3Lacos {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite sua idade para saber em qual categoria voc� se encaixa: ");
		idade = ler.nextInt();
		
		if (idade < 10) {
			System.out.println("Infelizmente voc� � muito jovem para estar em uma categoria.");
		}
		else if (idade >= 10 && idade <= 14) {
			System.out.println("Voc� se encaixa na categoria Infantil.");
	
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Voc� se encaixa na categoria Juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Voc� se encaixa na categoria adulto.");
		}
		else if (idade >= 26) {
			System.out.println("Infelizmente voc� n�o se encaixa em nenhuma categoria.");
		}
	}
}
