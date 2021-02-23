programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real R
		real S
		real A
		real B
		real C
		real D

		escreva ("Digite o valor de A: ")
		leia (A)
		escreva ("Digite o valor de B: ")
		leia (B)
		escreva ("Digite o valor de C: ")
		leia (C)

		R = Matematica.potencia((A + B), 2)
		S = Matematica.potencia((B + C), 2)
		D = (R + S) / 2

		escreva (" o valor de D é: ", D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */