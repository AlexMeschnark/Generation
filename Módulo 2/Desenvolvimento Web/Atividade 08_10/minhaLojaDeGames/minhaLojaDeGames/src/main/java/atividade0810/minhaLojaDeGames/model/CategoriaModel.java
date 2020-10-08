package atividade0810.minhaLojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "db_categoria")
public class CategoriaModel {
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String nomeCategoria;
	

	@NotNull
	@Size(min = 2, max = 500)
	private String tipoCategoria;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeCategoria() {
		return nomeCategoria;
	}


	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}


	public String getTipoCategoria() {
		return tipoCategoria;
	}


	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	
}
