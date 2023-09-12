package atividade03.application;

import atividade03.entities.Produto;

public class TestaGame {
	
	public static void main(String[] args) {
		Produto firstGame= new Produto("Zelda","Xbox - X ","Fantasy",2018,326);
		Produto secondGame= new Produto("FIFA 2021","PS5","SPORT",2020,319);
		
		firstGame.visualizar();
		secondGame.visualizar();	
	}


}
