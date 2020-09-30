/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package Exercicios;

import java.util.Scanner;

public class Exercicio3_11_09 {
	public static void main(String args[]) {
		float matriz[][] = new float [3][3];
		int l,c, maior10=0;
		Scanner ler =  new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Escreva um número: ");
				matriz[l][c] = ler.nextFloat();
			}
		}
		System.out.println("Valores maiores que dez: ");
			for(l=0;l<3;l++) {
				for(c=0;c<3;c++) {					
					if(matriz[l][c]>10) {
						maior10++;
						System.out.println(matriz[l][c]);
					}
				}
			}
			System.out.println("Há um total de "+maior10+" números maiores que 10.");
		
	

}
}