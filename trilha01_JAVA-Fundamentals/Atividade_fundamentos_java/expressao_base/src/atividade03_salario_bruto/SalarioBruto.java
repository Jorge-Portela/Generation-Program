package atividade03_salario_bruto;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBruto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horaExtra,descontos, salarioLiquido;
		
		System.out.printf("Salário Bruto: "); 
		salarioBruto = leia.nextFloat();
		
		System.out.printf("Adicional Noturno: "); 
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("Hora Extra: "); 
		horaExtra = leia.nextFloat();
		
		System.out.printf("descontos: "); 
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra*5) + descontos;
		
		System.out.printf("Salário Líquido: %.2f",salarioLiquido); 
		
		leia.close();
	}

}
