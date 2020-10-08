package atividade0810.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atividade0810.minhaLojaDeGames.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	public List<ProdutoModel> findAllBynomeProdutoContainingIgnoreCase (String nomeProduto);
}
