programa
{

//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
// - Todos os elementos nos índices ímpares do vetor 
// - Todos os elementos do vetor que são números pares
// - A Soma de todos os elementos do vetor
// - A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

	
	funcao inicio()
	{
		inteiro i,sum=0, vector [10]
		real average
	

		escreva("Vector: ")
		para (i=0;i<10;i++){
			escreva(vector[i] = i+1," | ")
			
			}
			
		//Todos os elementos nos índices ímpares do vetor 
		escreva("\nTodos os elementos nos ÍNDICES ÍMPARES do vetor: \n")

		para(i=0;i<10;i++){
			se(i % 2 !=0){
				escreva(vector[i]," | ")
								
				}
			
			}
			
		//Todos os elementos do vetor que são números pares
		escreva("\nTodos os elementos pares do vetor: ")
		para(i=0;i<10;i++){
			se(vector[i]%2==0){
				escreva(vector[i]," | ")
				
				}
			}

		//Soma de todos os elementos do vetor
		escreva("\nA Soma de todos os elementos do vetor: ")
		para(i=0;i<10;i++){
			sum+=vector[i]
			}
		escreva(sum)	

		//Média de todos os elementos do vetor, armazenada em uma variável do tipo real
		escreva("\nA Média de todos os elementos do vetor: ")
		
		average = sum/i
		
		escreva(average)
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */