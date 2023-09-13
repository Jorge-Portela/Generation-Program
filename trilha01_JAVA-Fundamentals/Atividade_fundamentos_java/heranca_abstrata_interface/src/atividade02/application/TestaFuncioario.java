package atividade02.application;

import atividade02.entities.Gerente;
import atividade02.entities.Vendedor;

public class TestaFuncioario {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Afonso Silva"," Gerente-1","M",36,26541,"GER01");
		Gerente g2 = new Gerente("Flavia Silva"," Gerente-3","F",61,231,"GER03");

		Vendedor vend1 = new Vendedor("Rose Maria"," Vendedora-2","F",42,639,"BELEM");
		Vendedor vend2 = new Vendedor("Cio Lima"," Vendedor-1","M",20,26987,"RIO DE JANEIRO");
		
		System.out.println("Dados Gerente: ");
		g1.visualizar();
		g2.visualizar();
		
		System.out.println();
		
		System.out.println("Dados Vendedor: ");
		vend1.visualizar();
		vend2.visualizar();
	}

}
