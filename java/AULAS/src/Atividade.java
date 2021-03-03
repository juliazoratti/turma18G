import java.util.Scanner;

public class Atividade {
	public static void main (String [] arg) {
		Scanner ler = new Scanner (System.in);
		
		int idade, ano, anoEmDias, quantidadeMeses;
		
		System.out.println("digite sua idade: ");
		idade=ler.nextInt();
		
		ano = idade /365;
		quantidadeMeses = (idade%365)/30;
		anoEmDias = (idade%365)%30;
		
		System.out.println("Você tem" + ano + "anos e" + quantidadeMeses + "meses e" + anoEmDias + "dias.");
	}
}
