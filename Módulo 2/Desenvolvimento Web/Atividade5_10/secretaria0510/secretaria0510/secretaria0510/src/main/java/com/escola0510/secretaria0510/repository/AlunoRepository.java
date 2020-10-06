package com.escola0510.secretaria0510.repository;


import com.escola0510.secretaria0510.model.Aluno;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	

public List<Aluno> findAllBynomeContainingIgnoreCase (String nome);
	
	

}