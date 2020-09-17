package POO;

import java.util.Scanner;

public class VendedorMain {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		 Vendedor vendedor1 = new Vendedor("","","",0,0,0,0);

		 vendedor1.CadastroVendedor();
		 System.out.println(vendedor1.getCadastroVendedor());

		  
	}

}
