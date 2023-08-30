package atividade02_nota_media;

import java.util.Locale;
import java.util.Scanner;

public class NotaMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		float nota1,nota2,nota3,nota4,media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Média Final: %.2f",media);
		
		leia.close();
	}

}
