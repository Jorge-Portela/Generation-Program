package atividade01.entities;

public class Cliente {
	String nome;
	String genero;
	int idade;
	int id;
	int numeroTelefone;
	
	
	public String getNome() {
		return nome;
	}



	public String getGenero() {
		return genero;
	}



	public int getIdade() {
		return idade;
	}



	public int getId() {
		return id;
	}



	public int getNumeroTelefone() {
		return numeroTelefone;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}



	

	public Cliente(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	

	public void visualizar() {
		System.out.print( "Titular: " + this.nome  
						 +" | ID: " + this.id );
	}

}
