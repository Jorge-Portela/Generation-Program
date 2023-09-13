package atividade01.application;

import atividade01.entities.PessoaFisica;
import atividade01.entities.PessoaJuridica;

public class TestaCliente {

	public static  void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica("Pablo Silva",256,36,"21-9451287","156.697.321-12","M");
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
