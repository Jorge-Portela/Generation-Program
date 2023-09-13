package atividade01.entities;

public abstract class Cliente {
	private String nome;
	private int id;
	private int idade;
	private String numeroTelefone;
	
	public Cliente(String nome, int id,int idade,String numeroTelefone) {
		this.nome = nome;
		this.id = id;
		this.idade = idade;
		this.numeroTelefone = numeroTelefone;
	}
	
	
	public abstract String nome();

	public abstract int id();

	
	public abstract int idade();


	public abstract String numeroTelefone();



	public void visualizar() {
		System.out.print( "Titular: " + this.nome  
						 +" | ID: " + this.id
						 +" | Idade: " + this.idade
						 +" | Número Telefone: " + this.numeroTelefone);
	}

}
