package atividade0810.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atividade0810.minhaLojaDeGames.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
	public List<UsuarioModel> findAllBynomeContainingIgnoreCase (String nome);
}
