//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.

package Exercicios;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		int dia, mes, ano;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com os dias: ");
		dia = ler.nextInt();
		System.out.println("Entre com o m�s: ");
		mes = ler.nextInt();
		System.out.println("Entre com os anos: ");
		ano = ler.nextInt();
		
		dia = dia + (365*ano) + (mes*30);
		System.out.println("Sua idade expressa em dias �: "+ dia);



	}

}
