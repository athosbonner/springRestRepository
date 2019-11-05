package com.br.crud.rest.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.crud.rest.crud.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Long>{
	
}
