package br.com.flat.flatapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flat.flatapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
