/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package Exercicios;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args)
	{
		float n;
		
		Scanner ler = new Scanner(System.in);
        
		System.out.println("Entre com um n�mmero: ");
		n = ler.nextFloat();
		
		if(n%2.0==0)
		{
			System.out.println(n+" � um n�mero par e sua raiz � "+ Math.sqrt(n));
		}
		else
		{
			System.out.println(n+" � um n�mero �mpar e elevado ao quadrado seu resultado � "+n*n);
		}
		
	}

}
