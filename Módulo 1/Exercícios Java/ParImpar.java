/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package Exercicios;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args)
	{
		float n;
		
		Scanner ler = new Scanner(System.in);
        
		System.out.println("Entre com um númmero: ");
		n = ler.nextFloat();
		
		if(n%2.0==0)
		{
			System.out.println(n+" é um número par e sua raiz é "+ Math.sqrt(n));
		}
		else
		{
			System.out.println(n+" é um número ímpar e elevado ao quadrado seu resultado é "+n*n);
		}
		
	}

}
