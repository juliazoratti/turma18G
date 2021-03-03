package OO;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Funcionario funcionario = new Funcionario ();
		
		char respostaFuncionario;
		
		funcionario.funcionario("João Ferreira", "Masculino", 45, "Farmácia Drogasil");
		
		System.out.println("\nDigite o seu turno para saber seu horário de entrada: (M - Matutino/ V - Vespertino/ N - Noturno) ");
		respostaFuncionario = leia.next().toUpperCase().charAt(0);
		
		funcionario.turno(respostaFuncionario);
	}

}
