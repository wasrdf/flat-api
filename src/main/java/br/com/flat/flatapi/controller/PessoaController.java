package br.com.flat.flatapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flat.flatapi.model.Pessoa;
import br.com.flat.flatapi.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping("/pessoas")
	public List<Pessoa> getAllPessoas() {
		return pessoaService.getAll();
	}

	@GetMapping("/pessoas/{id}")
	public ResponseEntity<Pessoa> getById(@PathVariable(value = "id") Long id) {
		Pessoa pessoa = pessoaService.findOne(id);
		if (pessoa == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(pessoa);
	}

	@PostMapping("/criarPessoa")
	public Pessoa criarPessoa(@Valid @RequestBody Pessoa pessoa) {
		return pessoaService.save(pessoa);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Pessoa> atualizarPessoa(@Valid @RequestBody Pessoa pessoa) {
		if (pessoa.getId() != null) {
			pessoaService.save(pessoa);
			return ResponseEntity.ok(pessoa);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Pessoa> delete(@PathVariable(value = "id") Long id) {
		Pessoa pessoa = pessoaService.findOne(id);
		if (pessoa == null) {
			return ResponseEntity.notFound().build();
		}
		pessoaService.deletar(pessoa);
		return ResponseEntity.ok().build();
	}
}