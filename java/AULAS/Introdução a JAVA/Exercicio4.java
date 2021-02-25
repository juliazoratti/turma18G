import java.util.Scanner;
import java.math.*;

public class Exercicio4 {
	public static void main (String [] args){
		
	Scanner ler = new Scanner (System.in);
		int a,b,c;
		double d;
		double r;
		double s;
	
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r + s) /2;
		
		
		System.out.println("o valor de D é: " + d);

	}
}
