//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.

package Exercicios;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		int dia, mes, ano,diaT;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva sua idade expressa em dias: ");
		diaT = ler.nextInt();
		
		ano = (diaT/365);
		mes = (diaT%365)/30;
		dia = (diaT%365)%30;
		
		System.out.println(" idade expressa em dia; m�s e ano � :"+ dia+ " dia(s) "+mes+ " m�s/meses "+ano+ " ano(s))");


	}

}
