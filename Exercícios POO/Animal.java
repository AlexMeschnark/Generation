package POO;

import java.util.Scanner;

public class Animal {
	
	Scanner ler = new Scanner(System.in);
	
	String nome, som, a��o;
	int idade, i;
	
	public Animal(String som, String a��o)
	{
		this.som = som;
		this.a��o = a��o;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getA��o() {
		return a��o;
	}
	public void setA��o(String a��o) {
		this.a��o = a��o;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}		
	
	public void setCadastroAnimal()
	{
		System.out.println("Insira o nome do animal: ");
		setNome(ler.nextLine());
		System.out.println("Insira a idade do animal: ");
		setIdade(ler.nextInt());
	}
	public void getCadastroAnimal()
	{
		System.out.println(getNome()+" tem "+getIdade()+" anos.");
		System.out.println("****************************");
		System.out.println(getNome()+" consegue "+getA��o());
		for(i=0;i<3;i++)
		{
			System.out.println(getSom());
		}
		System.out.println();
	}
}
