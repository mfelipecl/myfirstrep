package br.paduan.controle.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.controle.model.Atividade;

public interface AtividadeDAO  extends CrudRepository<Atividade, Integer>{
    
}
