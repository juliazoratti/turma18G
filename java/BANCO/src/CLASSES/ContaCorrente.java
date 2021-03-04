package CLASSES;

import java.util.Scanner;

public class ContaCorrente extends Conta {
    Scanner leia = new Scanner (System.in);

    private int contadorTalao;
    private char resposta; //RESPOSTA PARA A PERGUNTA: DESEJA SOLICITAR UM CHEQUE?
    private int totalChoques = 3;
    private char respostaSair;// variavel para contar as vezes que podem ser pedidas
    //PASSAR A VARIAVEL OPCAO PARA O MEU PROGRAMA

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
   
    
    
    	public void contadorTalao(char resposta) {
 
        //do
        //{

            if (resposta == 's' || resposta == 'S') {
                contadorTalao -= 1;

                    System.out.println("O total de cheques é " + contadorTalao);
            }

            
            else
            {
            System.out.println("Resposta inválida");
            }
            contadorTalao ++;
        }
       // while (contadorTalao <= 3 || resposta != 'S');
    	//}
   
    }


	



