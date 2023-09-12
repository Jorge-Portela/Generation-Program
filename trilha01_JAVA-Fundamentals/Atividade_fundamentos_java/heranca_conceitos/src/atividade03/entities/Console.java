package atividade03.entities;

public class Console extends Produto{
	private String modelo;

	public Console(String nome, String dispobibilidade, String tipo, int anoLancamento, int id, String modelo) {
		super(nome, dispobibilidade, tipo, anoLancamento, id);
		this.modelo = modelo;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("| Modelo: " + this.modelo );
	}

}
