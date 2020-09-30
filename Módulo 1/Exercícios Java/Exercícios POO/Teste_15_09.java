package POO;

import java.util.Scanner;

public class Teste_15_09  {
	
	public static void main(String args[])
	{
		String n, t, e;
		int rg, cpf;
		double credito, divida;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do fornecedor: ");
		 n = leia.nextLine();
		 System.out.println("Digite o telefone do fornecedor: ");
		 t = leia.nextLine();
		 System.out.println("Digite o endereço do fornecedor: ");
		 e = leia.nextLine();
		 System.out.println("Digite o RG do fornecedor: ");
		 rg = leia.nextInt();
		 System.out.println("Digite o CPF do fornecedor: ");
		 cpf = leia.nextInt();
		 System.out.println("Digite o crédito do fornecedor: ");
		 credito = leia.nextDouble();
		 System.out.println("Digite o divida do fornecedor: ");
		 divida= leia.nextDouble();
		 
		Fornecedor_15_09 fornecedor1 = new Fornecedor_15_09( n, t, e,  rg,  cpf,  credito,  divida); 
		 System.out.println("O fornecedor/fornecedora "+n+" contém de saldo R$ "+fornecedor1.obterSaldo());


	}
}
