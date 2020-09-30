/*
 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
String telefone;
 */

package POO;

import java.util.Scanner;

public class Pessoa_15_09 {
	Scanner leia = new Scanner(System.in);
	private String nome, endere�o, telefone;
    private int RG, CPF;
	public Pessoa_15_09(String nome, String endere�o, String telefone, int RG, int CPF) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.RG = RG;
		this.CPF = CPF;
	}
	
   

	public int getRG() {
		return RG;
	}



	public void setRG(int rG) {
		RG = rG;
	}



	public int getCPF() {
		return CPF;
	}



	public void setCPF(int cPF) {
		CPF = cPF;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public void setCadastro()
	{
		System.out.println("=======================");
		System.out.println("CADASTRO FUNCION�RIO");
		System.out.println("=======================");
		 System.out.println("Digite o nome da pessoa: ");
		 setNome(leia.nextLine()); 
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextLine());
		 System.out.println("Digite o endere�o: ");
		 setEndere�o(leia.nextLine());
		 System.out.println("Digite o RG: ");
		 setRG(leia.nextInt());
		 System.out.println("Digite o CPF: ");
		 setCPF(leia.nextInt());
	}
	public String getCadastro()
	{
		return ("\nINFORMA��ES FUNCION�RIO"+"\n=============="+"\nNome: "+ getNome()+"\nEndere�o "+getEndere�o()+"\nTelefone: "+getTelefone()+"\nRG: "+getRG()+"\nCPF: "+getCPF());
	}
}