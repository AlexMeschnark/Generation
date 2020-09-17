package POO;

import java.util.Scanner;

public class ProjetoCliente {
	Scanner leia = new Scanner(System.in);
	private String nome, sobrenome, email,endere�o;
    private int RG, CPF, telefone;
	public ProjetoCliente(String nome,String sobrenome ,String email, String endere�o, int telefone, int RG, int CPF) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
		System.out.println("Bem vinto � nossa loja!");
		System.out.println("Primeiramente, vamos te cadastrar.");
		System.out.println("");
		System.out.println("");
		System.out.println("=======================");
		System.out.println("CADASTRO CLIENTE");
		System.out.println("=======================");
		System.out.println("\n\n");
		 System.out.println("Digite o seu primeiro nome: ");
		 setNome(leia.nextLine()); 
		 System.out.println("Digite o seu �ltimo nome: ");
		 setSobrenome(leia.nextLine());
		 System.out.println("Digite o seu email: ");
		 setEmail(leia.nextLine());
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextInt());
		 System.out.println("Digite o endere�o: ");
		 setEndere�o(leia.nextLine());
		 System.out.println("Digite o RG: ");
		 setRG(leia.nextInt());
		 System.out.println("Digite o CPF: ");
		 setCPF(leia.nextInt());
	}
	public void setAtualiza��o()
	{
		 System.out.println("Digite o seu email: ");
		 setEmail(leia.nextLine());
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextInt());
		 System.out.println("Digite o endere�o: ");
		 setEndere�o(leia.nextLine());
		 System.out.println("*Dados atualizados.");
	}

	public String getCadastro()
	{
		return ("\nINFORMA��ES DO CLIENTE!"+"\n========================"+"\nNome: "+ getNome()+" "+getSobrenome()+"\nEndere�o "+getEndere�o()+"\nEmail: "+getEmail()+"\nTelefone: "+getTelefone()+"\nRG: "+getRG()+"\nCPF: "+getCPF());
	}
}
