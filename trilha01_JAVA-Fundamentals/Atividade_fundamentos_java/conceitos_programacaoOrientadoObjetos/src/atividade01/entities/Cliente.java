package atividade01.entities;

/*
 *Utilizando os conceitos de Classe, Objeto e Métodos, 
 *da Programação Orientada a Objetos, crie a Classe 
 *Cliente com os seus respectivos Métodos e Atributos. 
 *Na sequência, crie uma Classe chamada TestaCliente, 
 *instancie dois objetos da Classe Cliente e apresente 
 *as informações destes 2 Objetos no console.
 */
public class Cliente {
	String name;
	String gender;
	int age;
	int id;
	int phoneNumber;
	
	
	
	public Cliente() {}
	
	public Cliente(String name,	String gender, int age, int id,	int phoneNumber) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
		this.phoneNumber = phoneNumber;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void vizualizar() {
		 System.out.println( "Name: " +name 
				+" / Gender: "	+ gender
				+" / Age: " + age
				+" / ID: " + id  
		        +" / Phone Number: " + phoneNumber);
			}
	
	
	

}
