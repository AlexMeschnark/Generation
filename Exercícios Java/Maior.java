//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package Exercicios;

import java.util.Scanner;

public class Maior {
	public static void main(String[] args) {
		int vetor[] = new int[3];
		int i, maior=0, y;
		
		Scanner ler = new Scanner(System.in);

		
		for(i=0;i<3;i++) 
		{
			System.out.println("Entre com um n�mero: ");
			vetor[i] = ler.nextInt();
			
			maior = vetor[0];
			for(y=0;y<3;y++) { 
			if(maior<vetor[y])
			{
				maior = vetor[y];
			}
			}
		}
		System.out.println("O maior n�mero �: "+maior);System.out.println("O maior n�mero �: "+maior);

		
		
	}

}
