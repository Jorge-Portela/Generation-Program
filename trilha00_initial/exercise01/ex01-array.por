programa
{
	//Dado um vetor contendo 10 números inteiros não ordenados, construa um algoritmo 
	//que consiga ordenar o vetor em ordem decrescente, como mostra o exemplo abaixo:
	//Na construção do Algoritmo, utilize os seguintes conteúdos:
	// - Saída de dados
	// - Laços Condicionais
	// - Laços de Repetição


	funcao inicio()
	{
		/*Vector Declaration / Declaração de vetor */
		inteiro vector[]={52,64,11,63,8,14,8,2,6,12}
		inteiro i,n

		escreva("vector: ")
		
		para (i=0;i<10;i++){
			
			n = vector[i]	
			se(n < vector[i]) {
				
				escreva(vector[i]," | ")
				}
			
			}
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vector, 14, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */