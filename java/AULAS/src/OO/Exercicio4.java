package OO;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Funcionario funcionario = new Funcionario ();
		
		char respostaFuncionario;
		
		funcionario.funcionario("Jo�o Ferreira", "Masculino", 45, "Farm�cia Drogasil");
		
		System.out.println("\nDigite o seu turno para saber seu hor�rio de entrada: (M - Matutino/ V - Vespertino/ N - Noturno) ");
		respostaFuncionario = leia.next().toUpperCase().charAt(0);
		
		funcionario.turno(respostaFuncionario);
	}

}
