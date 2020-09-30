package POO;

import java.util.Scanner;

public class ProjetoLoja extends ProjetoCliente {
	
	Scanner leia = new Scanner(System.in);

	int idProduto, nSerie, qntXiaomi=0, qntTV=0, qntPc=0;;
    String produto, marca, modelo;

	int confirmação=0;
    double  valorT=0;
    
    public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getnSerie() {
		return nSerie;
	}

	public void setnSerie(int nSerie) {
		this.nSerie = nSerie;
	}

	
	public int getQntXiaomi() {
		return qntXiaomi;
	}

	public void setQntXiaomi(int qntXiaomi) {
		this.qntXiaomi = qntXiaomi;
	}

	public int getQntTV() {
		return qntTV;
	}

	public void setQntTV(int qntTV) {
		this.qntTV = qntTV;
	}

	public int getQntPc() {
		return qntPc;
	}

	public void setQntPc(int qntPc) {
		this.qntPc = qntPc;
	}

	public double getValorT() {
		return valorT;
	}

	public void setValorT(double valorT) {
		this.valorT = valorT;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

    
	public ProjetoLoja(String nome, String sobrenome, String email, String endereço, int telefone, int RG, int CPF) {
		super(nome, sobrenome, email, endereço, telefone, RG, CPF);
		/*this.idProduto = idProduto;
		this.nSerie = nSerie;
		this.produto = produto;
		this.marca = marca;
		this.modelo = modelo;
		*/
		
	}
	
	public void produto()
	{
		do {
		System.out.println("\n\n");
		System.out.println("Olá, "+super.getNome()+"! Seja bem vindo/a!!");
		System.out.println("Pressione um dos valores abaixo para adicionar "
				+ "ao carrinho ou pressione 0 para sair. ");
		System.out.println("\n\n");
		
		System.out.println("MENU:");
		System.out.println("1- XIAOMI ");
		System.out.println("2- COMPUTADOR");
		System.out.println("3- TELEVISÃO");
		setIdProduto(leia.nextInt());
		
		if (getIdProduto() == 1)
		{
			System.out.println("Foi adicionado ao seu carrinho um Xiaomi!");
			qntXiaomi++;
			valorT=valorT +2500;
			System.out.println("Valor total no carrinho R$: "+valorT);
		}else if(getIdProduto()== 2)
		{
			System.out.println("Foi adicionado ao seu carrinho um computador!");
			qntPc++;
			valorT=valorT +6999.99;
			System.out.println("Valor total no carrinho R$: "+valorT);
		}else if(getIdProduto() == 3) {
			System.out.println("Foi adicionado ao seu carrinho uma Televisão!");
			qntTV++;
			valorT=valorT +3499.90;
			System.out.println("Valor total no carrinho R$: "+valorT);
		}
		}while(getIdProduto()!=0);
		if (valorT == 0)
		{
			System.out.println("\n\n");
			System.out.println("Poxa... fica para a próxima."
					+ " Mesmo assim agradecemos a sua visita"
					+ " e te esperaremos ansiosamente pelo seu retorno. ");
		}else {
			System.out.println("\n\n");
			System.out.println("Agradecemos pela compra. Valor total R$: "+valorT);
			System.out.println("Enviaremos o/os produto(s) no endereço "+super.getEndereço()+""
					+ " dentro de sete dias. "
					+ "Caso tivermos qualquer tipo de problema em nossa entrega, entraremos em contato"
					+ "\ncom o email: "+super.getEmail()+
					"\ncom o número de telefone: "+super.getTelefone());
			System.out.print("\n");
			System.out.println("Os dados informados estão corretos? Se sim,"
					+ " digite 1 para confirmar"
					+ ", caso contrário digite 2 para atualizar o cadastro.");
			confirmação = leia.nextInt();
			if (confirmação==1)
			{
				System.out.println("");
				System.out.println("Obrigado por comprar em nossa loja! Aguardaremos pelo retorno.");
			}else if(confirmação == 2)
			{
				setAtualização();
				getCadastro();
				System.out.println("Agradecemos.");
			}
		}
	}	
}

	
