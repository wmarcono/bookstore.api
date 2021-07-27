package com.willians.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.willians.bookstore.domain.Livro;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
