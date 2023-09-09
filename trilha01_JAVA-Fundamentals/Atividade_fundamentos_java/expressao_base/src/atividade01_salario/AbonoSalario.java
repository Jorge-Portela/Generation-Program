package atividade01_salario;

import java.util.Locale;
import java.util.Scanner;

public class AbonoSalario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float salario = 0, abono = 0, novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo Salário: %.2f",novoSalario);
		
		leia.close();
		
	}

}
