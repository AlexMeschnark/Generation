/*
 * 6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que será adicionado ao vencimento base do Vendedor).
 */

package POO;

import java.util.Scanner;

public class Vendedor extends Pessoa_15_09{

	private double valorVendas, comissão;

	Scanner leia = new Scanner(System.in);

	public Vendedor(String nome, String endereço, String telefone, int RG, int CPF, double valorVendas, double comissão) {
		super(nome, endereço, telefone, RG, CPF);
		this.valorVendas = valorVendas;
		this.comissão = comissão;

	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissão() {
		return comissão;
	}

	public void setComissão(double comissão) {
		this.comissão = comissão;
	}
	
	public double vencimentoBase()
	{
		double vencimento = getValorVendas() - ((getComissão()/100)*getValorVendas());
		return vencimento;
	}
	
	public String informaçãoVenda()
	{
		return ("\nInformações do/da vendedor/vendedora "+super.getNome()+"\nTotal adquirido com as vendas R$: "+getValorVendas()+"\nValor da comissão: "+getComissão()+"%"+"\nVencimento base total R$: "+vencimentoBase());
	}
	
	
	
	public void  CadastroVendedor()
	{
		super.setCadastro();
		 System.out.println("=====================");
		 System.out.println("CADASTRO DE VENDEDORES");
		 System.out.println("=====================");
		 System.out.println("Digite o valor total adquirido pelas vendas do/da "+getNome());
		 setValorVendas(leia.nextDouble());
		 System.out.println("Digite o valor da comissão da/do "+getNome());
		 setComissão(leia.nextDouble());
		 System.out.println("=====================");
		 System.out.println("FIM DO CADASTRO");
		 System.out.println("=====================");
		 
	}
	public String getCadastroVendedor()
	{
		return super.getCadastro()+informaçãoVenda();
		
	}
}
