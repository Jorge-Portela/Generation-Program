package atividade02.entities;

public class Gerente extends Funcionario  {
	private String nivelDeAcesso; 

	public Gerente(String nome, String posicao, String genero, int idade, int id, String nivelDeAcesso) {
		super(nome, posicao, genero, idade, id);
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | Nivel de Acesso: " + this.nivelDeAcesso);
		
	}

}
