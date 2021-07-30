package com.willians.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willians.bookstore.domain.Categoria;
import com.willians.bookstore.domain.Livro;
import com.willians.bookstore.repositories.CategoriaRepository;
import com.willians.bookstore.repositories.LivroRepository;

@Service
public class DbService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Romance", "Livro de Romance");
		Categoria cat3 = new Categoria(null, "Aventura", "Livro de Aventura");
		Categoria cat4 = new Categoria(null, "Ficção", "Livro de Ficção");
		
		Livro l1 = new Livro(null, "Clean Code","Loren Ipsun", "loren ipsun...", cat1);
		Livro l2 = new Livro(null, "NomeTitulo","Autor", "loren ipsun...", cat1);
		Livro l3 = new Livro(null, "NomeTitulo","Autor", "loren ipsun...", cat2);
		Livro l4 = new Livro(null, "NomeTitulo","Autor", "loren ipsun...", cat4);
		Livro l5 = new Livro(null, "NomeTitulo","Autor", "loren ipsun...", cat3);
		Livro l6 = new Livro(null, "NomeTitulo","Autor", "loren ipsun...", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l6));
		cat3.getLivros().addAll(Arrays.asList(l5));
		cat4.getLivros().addAll(Arrays.asList(l4));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5, l6));
	}
}