package atividade01.entities;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	
	public PessoaJuridica(String nome, int id,int idade,String numeroTelefone,String cnpj) {
		super(nome, id,idade,numeroTelefone);
		this.cnpj = cnpj;
		
	}
	
   
	
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
		System.out.println(" | Cnpj: " + this.cnpj);
	}


}
