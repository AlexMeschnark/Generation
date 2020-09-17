package POO;

import java.util.Scanner;

public class ProjetoCliente {
	Scanner leia = new Scanner(System.in);
	private String nome, sobrenome, email,endereço;
    private int RG, CPF, telefone;
	public ProjetoCliente(String nome,String sobrenome ,String email, String endereço, int telefone, int RG, int CPF) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.endereço = endereço;
		this.telefone = telefone;
		this.RG = RG;
		this.CPF = CPF;
	}
	
	

	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	public void setCadastro()
	{
		System.out.println("\n\n");
		System.out.println("Bem vinto à nossa loja!");
		System.out.println("Primeiramente, vamos te cadastrar.");
		System.out.println("");
		System.out.println("");
		System.out.println("=======================");
		System.out.println("CADASTRO CLIENTE");
		System.out.println("=======================");
		System.out.println("\n\n");
		 System.out.println("Digite o seu primeiro nome: ");
		 setNome(leia.nextLine()); 
		 System.out.println("Digite o seu último nome: ");
		 setSobrenome(leia.nextLine());
		 System.out.println("Digite o seu email: ");
		 setEmail(leia.nextLine());
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextInt());
		 System.out.println("Digite o endereço: ");
		 setEndereço(leia.nextLine());
		 System.out.println("Digite o RG: ");
		 setRG(leia.nextInt());
		 System.out.println("Digite o CPF: ");
		 setCPF(leia.nextInt());
	}
	public void setAtualização()
	{
		 System.out.println("Digite o seu email: ");
		 setEmail(leia.nextLine());
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextInt());
		 System.out.println("Digite o endereço: ");
		 setEndereço(leia.nextLine());
		 System.out.println("*Dados atualizados.");
	}

	public String getCadastro()
	{
		return ("\nINFORMAÇÕES DO CLIENTE!"+"\n========================"+"\nNome: "+ getNome()+" "+getSobrenome()+"\nEndereço "+getEndereço()+"\nEmail: "+getEmail()+"\nTelefone: "+getTelefone()+"\nRG: "+getRG()+"\nCPF: "+getCPF());
	}
}
