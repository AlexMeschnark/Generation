package atividade0810.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atividade0810.minhaLojaDeGames.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	public List<CategoriaModel> findAllByNomeCategoriaContainingIgnoreCase (String nomeCategoria);
}
