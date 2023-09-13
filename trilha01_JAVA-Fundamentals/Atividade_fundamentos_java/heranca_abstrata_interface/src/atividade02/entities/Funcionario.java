package atividade02.entities;

public abstract class Funcionario {
	private String nome;
	private String posicao;
	private String genero;
	private int idade;
	private int id;
	

	public Funcionario(String nome, String posicao, String genero, int idade, int id) {	
		 this.nome =nome ;
		 this.posicao = posicao;
		 this.genero = genero;
		 this.idade = idade;
		 this.id = id;	
	}



	
	public String getNome() {
		return nome;
	}




	public String getPosicao() {
		return posicao;
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




	public void setNome(String nome) {
		this.nome = nome;
	}




	public void setPosicao(String posicao) {
		this.posicao = posicao;
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




	public void visualizar() {
		System.out.print(" Nome: " +  this.nome
		                   +" | Posição: " + this.genero
		                   +" | Idade: " + this.idade
		                   +" | ID: " + this.id);
		
	}

	
	
}
