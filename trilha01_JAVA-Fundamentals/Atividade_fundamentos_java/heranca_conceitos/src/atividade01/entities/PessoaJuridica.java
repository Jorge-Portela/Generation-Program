package atividade01.entities;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	
	public PessoaJuridica(String nome, int id,String cnpj) {
		super(nome, id);
		this.cnpj = cnpj;
		
	}
	
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | Cnpj: " + this.cnpj);
	}

}
