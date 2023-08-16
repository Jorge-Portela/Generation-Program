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
		inteiro i,k,paramater,vector[10]={52,64,11,63,18,14,8,2,6,12}
		 
		
		
		escreva("vetor ANTES da ordenação decrescente: ")

		para(i=0;i<10;i++){
			escreva(vector[i]," | ")			
			
			}
		
		
		para (i=0;i<10;i++){	
			para(k=i+1;k<10;k++){
			se(vector[k] < vector[i]) {
				paramater = vector[i]
				vector[i] = vector[k]
				vector[k] = paramater
				
				  }	
				
				}	
			}

		escreva("\nvetor DEPOIS da ordenação decrescente: ")
		
		para(i=0;i<10;i++){
			
			escreva(vector[i]," | ")	
			
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 893; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */