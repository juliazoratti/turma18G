package CLASSES;

import java.util.Scanner;

public class ContaCorrente extends Conta {
    Scanner leia = new Scanner (System.in);

    private int contadorTalao;
    

    //CONSTRUTOR
    public ContaCorrente(int numero, String cpf, boolean ativa, int contadorTalao) {
        super(numero, cpf, ativa);
        this.contadorTalao = contadorTalao;
    }
    
    //ENCAPSULAMENTO
    public int getContadorTalao() {
        return contadorTalao;
    }

    public void setContadorTalao(int contadorTalao) {
        this.contadorTalao = contadorTalao;
    }
   
    public void pediTalao()
    {
    	contadorTalao--;	
    	System.out.printf("QUANTIDADE DE TAL�ES DISPINIVEIS: %d", contadorTalao);
    	
    }   
}
	



