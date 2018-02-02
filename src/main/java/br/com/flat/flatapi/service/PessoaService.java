package br.com.flat.flatapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flat.flatapi.model.Pessoa;
import br.com.flat.flatapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> getAll() {
		return repository.findAll();
	}
	
	public Pessoa save(Pessoa pessoa) {
		return repository.save(pessoa);
	}
	
	public void deletar(Pessoa pessoa) {
		repository.delete(pessoa);
	}
	
	public Pessoa findOne(Long id) {
		return repository.findOne(id);
	}
}
