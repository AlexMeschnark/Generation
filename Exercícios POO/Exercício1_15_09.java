/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class Exercício1_15_09 {
	private String CPF;
	private String nome, email;
	private String ultimoNome;
	
	
	public Exercício1_15_09 (String CPF, String nome, String ultimoNome, String email)
	{
		this.CPF = CPF;
		this.nome = nome;
		this.ultimoNome = ultimoNome;
		this.email = email;
	}
	
	/*public Exercício1_15_09(String cPF2, String nome2, String ultimoNome2, String email2) {
		// TODO Auto-generated constructor stub
		
	}*/

	public String getCliente ()
	{
		String nomeCompleto = nome + " " + ultimoNome;
		return ("Sr(a). " + nomeCompleto + ", suas informações são " 
		+ "\nCPF: " + this.CPF + "\nEmail: " +this.email);
	}

}
