package br.paduan.controle.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.controle.model.Chamado;

public interface ChamadoDAO extends CrudRepository<Chamado, Integer>{
    
    
}
