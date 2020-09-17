/*
 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
String telefone;
 */

package POO;

import java.util.Scanner;

public class Pessoa_15_09 {
	Scanner leia = new Scanner(System.in);
	private String nome, endereço, telefone;
    private int RG, CPF;
	public Pessoa_15_09(String nome, String endereço, String telefone, int RG, int CPF) {
		this.nome = nome;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		System.out.println("CADASTRO FUNCIONÁRIO");
		System.out.println("=======================");
		 System.out.println("Digite o nome da pessoa: ");
		 setNome(leia.nextLine()); 
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextLine());
		 System.out.println("Digite o endereço: ");
		 setEndereço(leia.nextLine());
		 System.out.println("Digite o RG: ");
		 setRG(leia.nextInt());
		 System.out.println("Digite o CPF: ");
		 setCPF(leia.nextInt());
	}
	public String getCadastro()
	{
		return ("\nINFORMAÇÕES FUNCIONÁRIO"+"\n=============="+"\nNome: "+ getNome()+"\nEndereço "+getEndereço()+"\nTelefone: "+getTelefone()+"\nRG: "+getRG()+"\nCPF: "+getCPF());
	}
}