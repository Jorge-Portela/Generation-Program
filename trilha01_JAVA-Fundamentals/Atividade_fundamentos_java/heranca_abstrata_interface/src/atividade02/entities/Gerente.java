package atividade02.entities;

public class Gerente extends Funcionario implements Compliances {
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
	public void caixaEmail() {
		System.out.println("Verificar a caixa de email as 8:40hs");
		
	}
	
	@Override
	public void saudar() {
		System.out.println("Olá! Seja bem vindo ao departamento");
		
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | Nivel de Acesso: " + this.nivelDeAcesso);
		
	}


}
