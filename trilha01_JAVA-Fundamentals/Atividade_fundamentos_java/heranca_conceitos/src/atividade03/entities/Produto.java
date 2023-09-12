package atividade03.entities;
/**
 *Utilizando os conceitos de Classe, Objeto e Métodos, da 
 *Programação Orientada a Objetos, crie a Classe Cliente com 
 *os seus respectivos Métodos e Atributos. Na sequência, crie 
 *uma Classe chamada TestaCliente, instancie dois objetos da 
 *Classe Cliente e apresente as informações destes 2 Objetos 
 *no console.
 */
public class Produto {
	private String nome;
	private String dispobibilidade;
	private String tipo;
	private int anoLancamento;
	private int id;
	
	
	public Produto(String nome, String dispobibilidade, String tipo, int anoLancamento, int id) {
		this.nome = nome ;
		this.dispobibilidade = dispobibilidade;
		this.tipo = tipo;
		this.anoLancamento = anoLancamento;
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDispobibilidade() {
		return dispobibilidade;
	}


	public void setDispobibilidade(String dispobibilidade) {
		this.dispobibilidade = dispobibilidade;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getAnoLancamento() {
		return anoLancamento;
	}


	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		System.out.print("Name: " + this.nome 
						  +" | Disponivel: " + this.dispobibilidade
						  +" | tipo: " + this.tipo
						  +" | Ano de Lançaamento: " + this.anoLancamento
						  +" | ID: " + this.id);
	} 

}
