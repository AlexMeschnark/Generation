/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/

package POO;

public class ProdutoEletronico {
	String produto;
	double pre�o;

	
	public ProdutoEletronico(String produto2, double pre�o2) {
		this.produto = produto2;
		this.pre�o = pre�o2;
	}

	public String getProduto() {
		String infoProduto = "O produto � " + this.produto + " e seu pre�o � R$" + this.pre�o;
		return infoProduto;
	}
	
}
