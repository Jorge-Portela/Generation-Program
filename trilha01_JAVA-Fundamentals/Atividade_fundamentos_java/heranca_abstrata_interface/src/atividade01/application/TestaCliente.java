package atividade01.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import atividade01.entities.PessoaFisica;
import atividade01.entities.PessoaJuridica;

public class TestaCliente {

	public static  void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int input;
		boolean loop = true;
		int idadeClientePessFisic = 0;
		
		
		System.out.println("Cliente Nome: ");
		String nomeClientePessFisic = (leia.nextLine());	
		
		System.out.println("Cliente ID: ");
		int idClientePessFisic = (leia.nextInt());	
		
		
		do {
		
		try{
			System.out.println("Cliente Idade: ");
			 idadeClientePessFisic = input = leia.nextInt();;
			
			 loop = false;
		}catch(InputMismatchException e){
				System.err.println("\nExceção: " + e);
				leia.nextLine();
				System.out.println("\nDigite valores inteiros!");
		}catch(ArithmeticException e){
			System.err.println("\nExceção: " + e);
			leia.nextLine();
			System.out.println("\nDigite Numeros inteiros positivos!");
		}finally{
            System.out.println("\nSempre serei executada!\n");
        }
		}while(loop);
		
		
		
		
		
		System.out.println("Cliente Idade: ");
		String telClientePessFisic = (leia.nextLine());
		
		System.out.println("Cliente CPF: ");
		String cpfClientePessFisic = (leia.nextLine());
		
		System.out.println("Cliente Pessoa  genero: ");
		String genereoClientePessFisic = (leia.nextLine());
		
		
		
		
		PessoaFisica pf1 = new PessoaFisica(nomeClientePessFisic,idClientePessFisic,idadeClientePessFisic,telClientePessFisic,cpfClientePessFisic,genereoClientePessFisic);
		PessoaFisica pf2 = new PessoaFisica("Maria Cardoso",97,42,"44-9541871","032.789.123-21","F");
		
		PessoaJuridica pj1 = new PessoaJuridica("Flavio Dias",6351,25,"24-95413698 ","1230.0001.33214/9");
		PessoaJuridica pj2 = new PessoaJuridica("Leonardo Ramos",147,31," " ,"5631.0001.9467/12");
		
		System.out.println("Dados Pessoa Física:");
		pf1.visualizar();
		pf2.visualizar();
		
		System.out.println();
		
		System.out.println("Dados Pessoa Jurídica:");
		pj1.visualizar();
		pj2.visualizar();
	}

}
