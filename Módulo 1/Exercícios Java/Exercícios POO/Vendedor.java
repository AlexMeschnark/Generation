/*
 * 6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorVendas
(correspondente ao valor monet�rio dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que ser� adicionado ao vencimento base do Vendedor).
 */

package POO;

import java.util.Scanner;

public class Vendedor extends Pessoa_15_09{

	private double valorVendas, comiss�o;

	Scanner leia = new Scanner(System.in);

	public Vendedor(String nome, String endere�o, String telefone, int RG, int CPF, double valorVendas, double comiss�o) {
		super(nome, endere�o, telefone, RG, CPF);
		this.valorVendas = valorVendas;
		this.comiss�o = comiss�o;

	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComiss�o() {
		return comiss�o;
	}

	public void setComiss�o(double comiss�o) {
		this.comiss�o = comiss�o;
	}
	
	public double vencimentoBase()
	{
		double vencimento = getValorVendas() - ((getComiss�o()/100)*getValorVendas());
		return vencimento;
	}
	
	public String informa��oVenda()
	{
		return ("\nInforma��es do/da vendedor/vendedora "+super.getNome()+"\nTotal adquirido com as vendas R$: "+getValorVendas()+"\nValor da comiss�o: "+getComiss�o()+"%"+"\nVencimento base total R$: "+vencimentoBase());
	}
	
	
	
	public void  CadastroVendedor()
	{
		super.setCadastro();
		 System.out.println("=====================");
		 System.out.println("CADASTRO DE VENDEDORES");
		 System.out.println("=====================");
		 System.out.println("Digite o valor total adquirido pelas vendas do/da "+getNome());
		 setValorVendas(leia.nextDouble());
		 System.out.println("Digite o valor da comiss�o da/do "+getNome());
		 setComiss�o(leia.nextDouble());
		 System.out.println("=====================");
		 System.out.println("FIM DO CADASTRO");
		 System.out.println("=====================");
		 
	}
	public String getCadastroVendedor()
	{
		return super.getCadastro()+informa��oVenda();
		
	}
}
