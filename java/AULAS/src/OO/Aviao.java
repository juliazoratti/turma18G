package OO;

import java.util.Scanner;

public class Aviao {
	
	private String fabricante;
	private String modeloAviao;
	private int assentos;
	private int portas;
	public boolean resposta;
	
	public void Aviao (String fabricante, String modeloAviao, int assentos, int portas) {
		System.out.printf("O avi�o %s, fabricado pela empresa %s, tem %d assentos e %d portas", modeloAviao, fabricante, assentos, portas);
		
	}
	public void decolar () {
		
		this.resposta = true;
		System.out.println("O avi�o vai decolar...");
		System.out.println("O avi�o DECOLOU!");
	}
	
	public void naoDecolar () {
		this.resposta = false;
		System.out.println("O avi�o n�o decolar�.");
	}
		
}
	