/*
 * 4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).
 */

package POO;

public class Administrador extends Pessoa_15_09 {
	double ajudaDeCusto;

	public Administrador(String nome, String endereço, String telefone, int RG, int CPF, double ajudaDeCusto) {
		super(nome, endereço, telefone, RG, CPF);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
