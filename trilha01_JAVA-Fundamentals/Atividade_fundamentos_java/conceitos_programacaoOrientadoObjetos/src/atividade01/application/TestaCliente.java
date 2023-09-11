package atividade01.application;

import atividade01.entities.Cliente;

public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente firstCliente = new Cliente("Carlo Vera", "M", 40, 2651, 219856741); 
		Cliente secondCliente = new Cliente("Maria Carla", "F", 21, 2652, 343356814);
	
		firstCliente.vizualizar();
		secondCliente.vizualizar();
	
	
	}

}
