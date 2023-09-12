package atividade03.entities;

public class Jogo extends Produto {
	private String localArmazenado;
	
	public Jogo(String nome, String dispobibilidade, String tipo, int anoLancamento, int id,String localArmazenado) {
		super(nome, dispobibilidade, tipo, anoLancamento, id);
		this.localArmazenado = localArmazenado;
	}

	public String getLocalArmazenado() {
		return localArmazenado;
	}


	public void setLocalArmazenado(String localArmazenado) {
		this.localArmazenado = localArmazenado;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" | Local Armazenado: " + this.localArmazenado);
		}

}
