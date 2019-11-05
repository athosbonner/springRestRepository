package com.br.crud.rest.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.crud.rest.crud.model.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long> {
	
}
