import java.util.Scanner;

public class Exemplo {
	public static void main (String [] main) {
		
		Scanner ler = new Scanner(System.in);
		int idadeNadador;
		
		System.out.println("Escreva a idade do nadador: ");
		idadeNadador = ler.nextInt();
		
		if (idadeNadador < 5) {
			System.out.println("Infelizmente n�o podemos vender.");
		}
		else if (idadeNadador <= 7){
			System.out.println("Infantil A = 5 a 7 anos.");
		}
		else if (idadeNadador <= 11){
			System.out.println("Infantil B = 8 a 11 anos");
		}
		else if (idadeNadador <= 13) {
			System.out.println("Juvenil A = 12 a 13 anos");
		}
		else if (idadeNadador <= 17) {
			System.out.println("Juvenil B = 14 a 17 anos");
		}
		else {
			System.out.println("Adultos = Maiores de 18 anos");
		}
			
		System.out.println("Obrigado, volte sempre!");
	}

}
