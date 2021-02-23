programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d, p1, p2

		escreva ("Digite valor de x1: ")
		leia (x1)
		escreva ("Digite valor de x2: ")
		leia (x2)
		escreva("Digite valor de y1: ")
		leia (y1)
		escreva("Digite valor de y2: ")
		leia (y2)

		p1 = (x2-x1)
		p2 = (y2-y1)
		p1 = Matematica.potencia(p1, 2)
		p2 = Matematica.potencia(p2, 2)
		d = Matematica.raiz((p1 + p2), 2)

		escreva ("O valor de d é: ",Matematica.arredondar(d, 3))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */