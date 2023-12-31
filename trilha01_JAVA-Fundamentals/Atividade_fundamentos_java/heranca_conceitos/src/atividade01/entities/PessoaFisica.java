package atividade01.entities;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	private String genero;
	
	public PessoaFisica(String nome, int id,String cpf,String genero) {
		super(nome, id);
		this.cpf = cpf;
		this.genero = genero;
	}


	
	
	public String getCpf() {
		return cpf;
	}


	public String getGenero() {
		return genero;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | CPF: " + this.cpf  
						  +" | Gênero: " + this.genero);
		
	}


}
