package atividade01.entities;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String genero;
	
	public PessoaFisica(String nome, int id,String cpf,String genero) {
		super(nome, id);
		this.cpf = cpf;
		this.genero = genero;
	}

	public String getGender() {
		return genero;
	}

	public void setGender(String genero) {
		this.genero = genero;
	}

	
	public String getCnpj() {
		return cpf;
	}

	public void setCnpj(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | CPF: " + this.cpf  
						  +" | Gênero: " + this.genero);
		
	}


}
