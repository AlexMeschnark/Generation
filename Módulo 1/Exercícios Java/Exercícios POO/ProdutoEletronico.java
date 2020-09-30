/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package POO;

public class ProdutoEletronico {
	String produto;
	double preço;

	
	public ProdutoEletronico(String produto2, double preço2) {
		this.produto = produto2;
		this.preço = preço2;
	}

	public String getProduto() {
		String infoProduto = "O produto é " + this.produto + " e seu preço é R$" + this.preço;
		return infoProduto;
	}
	
}
