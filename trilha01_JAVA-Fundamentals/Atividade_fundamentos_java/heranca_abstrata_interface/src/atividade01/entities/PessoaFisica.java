package atividade01.entities;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String genero;
	
	public PessoaFisica(String nome, int id,int idade,String numeroTelefone,String cpf,String genero) {
		super(nome, id,idade,numeroTelefone);
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
	public String nome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int idade() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String numeroTelefone() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | CPF: " + this.cpf  
						  +" | Gênero: " + this.genero);
		
	}



}
