package com.example.generation.educa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.generation.educa.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); 
}
