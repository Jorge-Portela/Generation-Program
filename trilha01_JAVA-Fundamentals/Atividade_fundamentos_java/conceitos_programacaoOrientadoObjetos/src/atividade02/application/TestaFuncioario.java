package atividade02.application;

import atividade02.entities.Funcionario;

public class TestaFuncioario {


	public static void main(String[] args) {

		 Funcionario firstFuncioario = new Funcionario("Bruno Carlo","Mechanical Engineering","M",28,26598);
		 Funcionario secondFuncioario = new Funcionario("Daiane Lima","Quimical Engineering","F",21,26581);
		 
		 firstFuncioario.vizualizar();
		 secondFuncioario.vizualizar();
		 
	}

}
