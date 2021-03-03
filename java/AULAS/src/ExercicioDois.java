import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int anos, meses, dias, idadeEmDias;
		
		System.out.println("Digite sua idade em dias: ");
		idadeEmDias = ler.nextInt();
		
		anos = (idadeEmDias%365);
		meses = (idadeEmDias %30)/30;
		dias = (idadeEmDias %30)%30;
		
		System.out.printf("Sua idade é: " + anos +" anos, " + meses + "meses e " + dias + " dias");

	}

}
