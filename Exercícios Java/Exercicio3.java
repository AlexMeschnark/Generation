package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int segundot, segundo, minuto, hora;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a dura��o de sua f�brica em segundos: ");
		segundot = ler.nextInt();
		
		hora = segundot/3600;
		minuto = (segundot%3600)/60;
		segundo = (segundot%3600/60);
		
		System.out.println("Tempo total de sua f�brica �: "+hora+ " hora(s) "+minuto+" minutos "+segundo+" segundos.");


	}

}
