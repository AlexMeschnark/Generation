//2- Faça um programa que entre com três números e coloque em ordem crescente.

package Exercicios;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		int vetor[] = new int[3], conta,contb, c=0;
		
		Scanner ler = new Scanner(System.in);

		for(conta=0;conta<3;conta++) 
		{
			System.out.println("Entre com um número: ");
			vetor[conta] = ler.nextInt();	
		}
		for(conta=0;conta<2;conta++)
		{
			for(contb=conta+1;contb<3;contb++)
			{
				if(vetor[conta]>vetor[contb])
				{
					c = vetor[contb];
					vetor[contb] = vetor[conta];
					vetor[conta] = c;
				}
			}
		}
		for (conta=0; conta<3;conta++)
		{
			System.out.println(vetor[conta]);
		}

	}

}
