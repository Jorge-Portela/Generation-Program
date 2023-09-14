package atividade02.entities;

public class Vendedor extends Funcionario implements Compliances {
	private String localDeVenda;

	public Vendedor(String nome, String posicao, String genero, int idade, int id, String localDeVenda) {
		super(nome, posicao, genero, idade, id);
		this.localDeVenda = localDeVenda;
	}

	public String getLocalDeVenda() {
		return localDeVenda;
	}

	public void setLocalDeVenda(String localDeVenda) {
		this.localDeVenda = localDeVenda;
	}

	
	@Override
	public void caixaEmail() {
		System.out.println("Verificar a caixa de email as 7:40hs");
		
	}
	
	@Override
	public void saudar() {
		System.out.println("Olá! Seja bem vindo ao departamento");
		
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | Local de Venda: " + this.localDeVenda);
	}
	

}
