package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public PessoaServiceImpl() {
	}
	
	@Transactional
	public void insere() {
		pessoaRepository.save(new Pessoa("João", "Souza"));
		pessoaRepository.save(new Pessoa("Maria", "Saraiva"));
		pessoaRepository.save(new Pessoa("José", "Rocha"));
	}

	public List<Pessoa> findAll() {
		List<Pessoa> l = pessoaRepository.findAll();
		return l;
	}

}
