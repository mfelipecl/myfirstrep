package com.lopes.loja.dao;

import com.lopes.loja.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository< Usuario, Integer>{
    public Usuario findbyEmailAndSenha(String email, String senha);
}
