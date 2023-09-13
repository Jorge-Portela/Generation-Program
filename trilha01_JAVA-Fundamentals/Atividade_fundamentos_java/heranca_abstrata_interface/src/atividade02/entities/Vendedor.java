package atividade02.entities;

public class Vendedor extends Funcionario {
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
	public void visualizar() {
		super.visualizar();
		System.out.println(" | Local de Venda: " + this.localDeVenda);
	}
	

}
