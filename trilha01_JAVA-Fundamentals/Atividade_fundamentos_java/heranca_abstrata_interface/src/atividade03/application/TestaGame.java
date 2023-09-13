package atividade03.application;

import atividade03.entities.Console;
import atividade03.entities.Jogo;

public class TestaGame {
	
	public static void main(String[] args) {
		Jogo jogo1= new Jogo("Zelda","Sim","Fantasy",2021,236,"RUA-5");
		Jogo jogo2= new Jogo("FIFA 2021","NÃO","SPORT",2020,319,"RUA-2");
		
		Console console1 = new Console("PS5","SIM","ELETRÔNICO",2015,319,"SLIM");
		Console console2 = new Console("XBOX","NÃO","ELETRÔNICO",2016,3489,"ONE");
		
		
		System.out.println("Dados Jogo: ");
		jogo1.visualizar();
		jogo2.visualizar();
		
		System.out.println();
		
		System.out.println("Dados Console: ");
		console1.visualizar();
		console2.visualizar();
	}


}
