package br.com.flat.flatapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.flat.flatapi.model.Profissao;
import br.com.flat.flatapi.repository.ProfissaoRepository;

@Service
public class ProfissaoService {
	
	@Autowired
	private ProfissaoRepository repository;
	
	public List<Profissao> getAll() {
		return repository.findAll();
	}
	
}
