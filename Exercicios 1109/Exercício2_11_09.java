/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/

package Exercicios;

import java.util.Scanner;

public class Exercício2_11_09 {
	public static void main (String [] args)
	{
		int cont, par=0, impar=0, somapar=0, somaimpar = 0;
		int n[] = new int[6], pares[] = new int[6], impares[] = new int[6];
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite 6 números:");

		
		for(cont=0;cont<6;cont++)
		{
			n[cont] = leia.nextInt();
			if (n[cont]%2==0)
			{
				pares[par]=n[cont];
				par++;
				somapar = somapar + n[cont];
			}else {
				impares[impar]=n[cont];
				impar++;
				somaimpar = somaimpar + n[cont];			
		}
		}
		System.out.println("Houve um total de "+par+" pares. Sendo eles: ");
		for(cont=0;cont<par;cont++)
		{
			System.out.print(" "+pares[cont]+" ");
		}
		System.out.println("\nSoma de todos os pares: "+somapar+".");
		System.out.println("\n-------------------------------------");
		System.out.println("\n-------------------------------------");
		System.out.println("");
		System.out.print("Houve um total de "+impar+" ímpares. Sendo eles: ");
		for(cont=0;cont<impar;cont++)
		{
			System.out.print(" "+impares[cont]+" ");
		}
		System.out.println("\nSoma de todos os ímpares: "+somaimpar+".");
	}   
}

