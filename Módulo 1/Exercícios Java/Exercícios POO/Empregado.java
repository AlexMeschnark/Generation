/*
 * 3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores
e um método calcularSalario. Escreva um programa de teste adequado para a classe
Empregado.
 */

package POO;

public class Empregado extends Pessoa_15_09 {
	
	int codigoSetor;
	double salarioBase, imposto;
	
	public Empregado (String nome, String telefone, String endereço, int CPF, 
			int RG, double imposto, double salarioBase, int codigoSetor){
		super(nome, telefone, endereço, CPF, RG);
		this.imposto = imposto;
		this.salarioBase = salarioBase;
		this.codigoSetor = codigoSetor;
	}
	
	public double calcularSalario()
	{
		double calcularSalario = getSalarioBase() - getSalarioBase()*(getImposto()/100);
		return calcularSalario;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	
}
