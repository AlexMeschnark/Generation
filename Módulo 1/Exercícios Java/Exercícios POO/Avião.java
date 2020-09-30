/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class Avião {
	private String carga;
	private String piloto;
	private double capacidadeKG;

	public Avião(String carga, String piloto, double capacidadeKG) {
		this.carga = carga;
		this.piloto = piloto;
		this.capacidadeKG = capacidadeKG;
	}
	
	/*public Avião(String carga2, String piloto2, int capacidadeKG2) {
		// TODO Auto-generated constructor stub
	}*/

	public String getAvião()
	{
		String avião = ("O avião é pilotado por "+this.piloto+" e contém a carga de "+this.carga+" com a capacidade em kg de "+this.capacidadeKG);
		return avião;
	}

	

}
