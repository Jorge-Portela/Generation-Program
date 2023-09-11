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
	private String name;
	private String console;
	private String type;
	private int releaseYr;
	private int id;
	
	
	public Produto(String name, String console, String type, int releaseYr, int id) {
		this.name = name ;
		this.console = console;
		this.type = type;
		this.releaseYr = releaseYr;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getConsole() {
		return console;
	}


	public void setConsole(String console) {
		this.console = console;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getReleaseYr() {
		return releaseYr;
	}


	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		System.out.println("Name: " + this.name 
						  +" / Console" + this.console
						  +" / Type: " + this.type
						  +" / Year of release: " + this.releaseYr
						  +" / ID: " + this.id);
	} 

}
