package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes
		 * durante 4 bimestres de um ano. As 4 notas de cada participante serão
		 * armazenadas em uma linha de uma matriz de números reais, logo cada linha da
		 * matriz serão as notas de um participante. Em um vetor de números reais,
		 * armazene as médias de cada participante e exiba as médias de cada um na tela.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		final int alunes = 10;
		final int bimestres = 4;
		float validNota = 0;
		float matrizNotas[][] = new float[alunes][bimestres];
		float media[] = new float[alunes];
		
		

		System.out.println("Quadro de notas:");
		for (int i = 0; i < alunes; i++) {
			System.out.println("Digite as notas do alune " + (i + 1) + ":");
			for (int j = 0; j < bimestres; j++) {
				System.out.print("Bimestre " + (j + 1) + ": ");
				matrizNotas[i][j]= leia.nextFloat();
				if ( validNota < 0 || validNota > 10) {
                    System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
                    j--; 
                } else {
                	matrizNotas[i][j] = validNota;
                }
			}
		}
		
		
		for (int i = 0; i < alunes; i++) {
            float somaNotas = 0;
            for (int j = 0; j < bimestres; j++) {
                somaNotas += matrizNotas[i][j];
            }
            media[i] = somaNotas / bimestres;
        }
		
		
		System.out.println("Médias dos participantes:");
        for (int i = 0; i < alunes; i++) {
            System.out.println("Participante " + (i + 1) + ": " + media[i]);
        }
		
		
		
		
		
		
		
		
		

		leia.close();

	}

}
