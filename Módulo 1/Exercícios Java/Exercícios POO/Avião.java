/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package POO;

public class Avi�o {
	private String carga;
	private String piloto;
	private double capacidadeKG;

	public Avi�o(String carga, String piloto, double capacidadeKG) {
		this.carga = carga;
		this.piloto = piloto;
		this.capacidadeKG = capacidadeKG;
	}
	
	/*public Avi�o(String carga2, String piloto2, int capacidadeKG2) {
		// TODO Auto-generated constructor stub
	}*/

	public String getAvi�o()
	{
		String avi�o = ("O avi�o � pilotado por "+this.piloto+" e cont�m a carga de "+this.carga+" com a capacidade em kg de "+this.capacidadeKG);
		return avi�o;
	}

	

}
