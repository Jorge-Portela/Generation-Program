package estrutura_de_dados;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2_stack {

	public static void main(String[] args) {
		/*
		 *Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe 
		 *String, para organizar a retirada de livros em uma pilha. O programa deverá ter um
		 *Menu que aceitará as opções 0, 1, 2 e 3:
		 *
		 *1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		 *2: Listar todos os livros da Pilha
		 *3: Retirar um livro da pilha 
		 *0: O programa deve ser finalizado.
		 *Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá
		 *informar que a pilha está vazia.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int input,opcao;
		Stack<String> livros = new Stack<String>();
		
		System.out.println("Lista de Opções: ");
		System.out.println("\n1:Adicionar Livro"
							+"\n\n2:Listar Livros"
							+"\n\n3:Retirar Livro"
							+"\n\n0:Finalizar Programa");
		System.out.print("\nDigite uma opção: ");
		input = leia.nextInt();
		opcao = input;
		
		while(opcao != 0) {
			
			if(opcao == 1) {
				System.out.print("\nDigite o nome: ");
				leia.nextLine();
				String addLivro = leia.nextLine();
				livros.push(addLivro);
				System.out.println();
				
			}else if(opcao == 2) {
				if(livros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				}else {
					System.out.println(livros);
				}
				
				
			}else if(opcao == 3) {
				if(livros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				}else {
					livros.pop();
					System.out.println(livros);
					System.out.println("Um Livro foi retirado da pilha!");
				}
				
			}
			
			System.out.print("\nDigite uma opção: ");
			input = leia.nextInt();
			opcao = input;
		}
		System.out.println("Programa Finalizado!"); 
		leia.close();
		
	}

}
