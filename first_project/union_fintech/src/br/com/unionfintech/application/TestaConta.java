package br.com.unionfintech.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.unionfintech.gestao.Conta;
import br.com.unionfintech.gestao.ContaCorrente;
import br.com.unionfintech.gestao.ContaPoupanca;
import br.com.unionfintech.gestao.SaldoInsuficienteException;
import br.com.unionfintech.gestao.util.Cores;

public class TestaConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		Scanner leia = new Scanner(System.in);
		
	
		
		int agencia=0;
		int numero=0;
	
		
		ContaCorrente cc = new ContaCorrente(agencia, numero);
		ContaPoupanca cp = new ContaPoupanca(agencia, numero);
		
		List<Conta> contas = new ArrayList<>();

		contas.add(cc);
		contas.add(cp);
		
		System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND +
				"||========================||  ");
		System.out.println("||       UNION BANK       ||");
		System.out.println("||========================||  ");
		System.out.println("||    1 - Criar Conta     ||");
		System.out.println("||    2 - Sacar           ||");
		System.out.println("||    3 - Depositar       ||");
		System.out.println("||    4 - Transferência   ||");
		System.out.println("||    5 - Mostrar Contas  ||");
		System.out.println("||    6 - Encargos        ||");
		System.out.println("||    7 - Sair            ||");
		System.out.println("||========================||");
		System.out.print("      SELECIONE A OPÇÃO: ");
		int opcao = leia.nextInt();
		
		
		
		
		while(opcao < 8) {
			
			
			
			switch(opcao) {
			
			case 1:
				System.out.println("CRIAR CONTA\n");
				
				System.out.println("TIPO DE CONTA (1 - CORRENTE / 2 - POUPANÇA)");
				int tipoConta = leia.nextInt();
				
				if(tipoConta == 1) {
					System.out.println("INSIRA AGÊNCIA:");
					agencia = leia.nextInt();
					System.out.println("INSIRA NÚMERO:");
					numero = leia.nextInt();
					
					
				}else if(tipoConta == 2){
					System.out.println("INSIRA AGÊNCIA:");
					agencia = leia.nextInt();
					System.out.println("INSIRA NÚMERO:");
					numero = leia.nextInt();
				}
				
				
				Conta contaNova = criarConta(tipoConta, agencia, numero);
                contas.add(contaNova);
				
				break;
				
			case 2:
			    System.out.println("SAQUE\n");
			    System.out.println("TIPO DE CONTA (1 - CORRENTE / 2 - POUPANÇA)");
			    int tipoContaSaque = leia.nextInt();

			    if (tipoContaSaque == 1) {
			        System.out.println("VALOR DO SAQUE: ");
			        double saqueCorrente = leia.nextDouble();
			        try {
			            cc.saque(saqueCorrente);
			            System.out.println(cc);
			        } catch (SaldoInsuficienteException e) {
			            System.out.println("Saldo insuficiente para efetuar o saque.");
			        }
			    } else if (tipoContaSaque == 2) {
			        System.out.println("VALOR DO SAQUE: ");
			        double saquePoupanca = leia.nextDouble();
			        try {
			            cp.saque(saquePoupanca);
			            System.out.println(cp);
			        } catch (SaldoInsuficienteException e) {
			            System.out.println("Saldo insuficiente para efetuar o saque.");
			        }
			    }
			    break;
			case 3:
				System.out.println("DEPOSITO\n");
				System.out.println("TIPO DE CONTA (1 - CORRENTE / 2 - POUPANÇA)");
				int tipoContaDeposito = leia.nextInt();
				
				if(tipoContaDeposito == 1) {
					System.out.println("VALOR DO DEPOSITO: ");
					double depositoCorrente = leia.nextDouble();
					cc.deposito(depositoCorrente);
					
					
				}else if(tipoContaDeposito == 2){
					System.out.println("VALOR DO DEPOSITO: ");
					double depositoPoupanca = leia.nextDouble();
					cp.deposito(depositoPoupanca);
				}
				break;
			case 4:
				System.out.println("TRANSFERÊNCIA\n");
				System.out.println("DIGITE VALOR DE TRANSFERÊNCIA: ");
				double transferencia = leia.nextDouble();
				cc.tranferencia(transferencia, cp);
				break;
				
			case 5:
				System.out.println("MOSTRAR CONTAS:\n");
				for (Conta conta : contas) {
				    System.out.println(conta);
				}
				break;
				
			case 6:
				System.out.println("VALOR DE ENCARGO: "+cc.getValorImposto());
				
				break;
			default:
				
				System.out.println("Obrigado pela preferência!");
				
			}
			
			System.out.println("||========================||  ");
			System.out.println("||       UNION BANK       ||");
			System.out.println("||========================||  ");
			System.out.println("||    1 - Criar Conta     ||");
			System.out.println("||    2 - Sacar           ||");
			System.out.println("||    3 - Depositar       ||");
			System.out.println("||    4 - Transferência   ||");
			System.out.println("||    5 - Mostrar Contas  ||");
			System.out.println("||    6 - Encargos        ||");
			System.out.println("||    7 - Sair            ||");
			System.out.println("||========================||");
			
			System.out.print("      SELECIONE A OPÇÃO: ");
			opcao = leia.nextInt();
			
		}
		
		
		leia.close();

	}
	
	public static Conta criarConta(int tipo, int agencia, int numero) {
        Conta novaConta;
        if (tipo == 1) {
            novaConta = new ContaCorrente(agencia, numero);
        } else if (tipo == 2) {
            novaConta = new ContaPoupanca(agencia, numero);
        } else {
            novaConta = null; 
        }
        return novaConta;
    }

}
