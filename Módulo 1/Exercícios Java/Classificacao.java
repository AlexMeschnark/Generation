/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
*/
package Exercicios;

import java.util.Scanner;

public class Classificacao {

	public static void main(String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Categoria infantil.");
		}
	    else if(idade>=15 && idade<=17)
		{
			System.out.println("Categoria juvenil.");
		}
	    else if(idade>=18 && idade<=25)
		{
			System.out.println("Categoria adulto.");
		}
	    else
		 {
			System.out.println("Categoria invalida.");
		 }
		}

		

}
