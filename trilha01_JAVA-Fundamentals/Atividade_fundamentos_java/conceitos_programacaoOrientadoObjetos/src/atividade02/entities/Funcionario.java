package atividade02.entities;

/**
 *Utilizando os conceitos de Classe, Objeto e Métodos, da Programação
 *Orientada a Objetos, crie a Classe Cliente com os seus respectivos 
 *Métodos e Atributos. Na sequência, crie uma Classe chamada 
 *TestaCliente, instancie dois objetos da Classe Cliente e apresente 
 *as informações destes 2 Objetos no console.
 */
public class Funcionario {
	private String name;
	private String role;
	private String gender;
	private int age;
	private int id;
	

	public Funcionario() {}
	
	public Funcionario(String name, String role,String gender, int age, int id) {
		this.name = name;
		this.role = role;
		this.age = age;
		this.id = id; 
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void vizualizar() {
		System.out.println("Name: " + this.name
						  +" / Role: " + this.role
						  +" / Age: " + this.age
						  +" / ID: " + this.id 
						  +" / Gender: " + this.gender);
	}



}
