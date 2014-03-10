package br.ufc.quixada.npi.service;

import java.util.List;

import br.ufc.quixada.npi.model.Pessoa;

public interface PessoaService {

	public abstract void insere();

	public abstract List<Pessoa> findAll();

}