package POO;

import java.util.Scanner;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Empregado empregado1 = new Empregado("","","",0,0,0,0,0);


		 System.out.println("Digite o nome do empregado: ");
		 empregado1.setNome(leia.nextLine()); 
		 System.out.println("Digite o telefone do empregado: ");
		 empregado1.setTelefone(leia.nextLine());
		 System.out.println("Digite o endereço do empregador: ");
		 empregado1.setEndereço(leia.nextLine());
		 System.out.println("Digite o RG do empregado: ");
		 empregado1.setRG(leia.nextInt());
		 System.out.println("Digite o CPF do empregado: ");
		 empregado1.setCPF(leia.nextInt());		 
		 System.out.println("Digite o código do empregado: ");
		 empregado1.setCodigoSetor(leia.nextInt());
		 System.out.println("Digite o salario do empregado: ");
		 empregado1.setSalarioBase(leia.nextDouble());;
		 System.out.println("Digite o imposto do empregado: ");
		 empregado1.setImposto(leia.nextDouble());;
		 
		
		 
		 System.out.println("O empregado/empregada "+empregado1.getNome()+ " tem o salário atualizado, sendo: "+ empregado1.calcularSalario() );
	}

}
