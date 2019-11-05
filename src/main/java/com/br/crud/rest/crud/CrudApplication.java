package com.br.crud.rest.crud;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.crud.rest.crud.model.Autor;
import com.br.crud.rest.crud.model.Livro;
import com.br.crud.rest.crud.repository.AutorRepository;
import com.br.crud.rest.crud.repository.LivroRepository;	

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@Autowired //Injeção de dependência
	private AutorRepository autorRep;
	
	@Autowired
	private LivroRepository livroRep;
	
	
	@PostConstruct
	@Transactional
	public void onLoad() {
		
		Autor julho = new Autor();
		julho.setNome("Julho");
		autorRep.save(julho);
		
		Livro livro = new Livro();
		livro.setTitulo("Começando com Spring");
		livro.setDescricao("Livro de Julho Battisti");
		livro.setNumeroPagina(350);
		livro.add(julho);
		livroRep.save(livro);
		
	}
	
	
	
}
