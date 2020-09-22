package com.lopes.loja.controller;

import java.nio.file.attribute.UserDefinedFileAttributeView;

import com.lopes.loja.dao.UsuarioDAO;
import com.lopes.loja.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") // aceita pedidos de qualquer origem
public class UsuarioController {
    // delega ao JPA a responsabilidade de criar a classe para esse DAO e
    // implementar os métodos
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("usuario/{id}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable int id) {
        Usuario usuario = dao.findById(id).orElse(null); // busca usuário pela chave primária

        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("usuario/login")
    public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario userIncompleto) {
        Usuario userFinded = dao.findbyEmailAndSenha(userIncompleto.getEmail(), userIncompleto.getSenha());

        if (userFinded != null) {
            
            return ResponseEntity.ok(userFinded);
        } else {
            return ResponseEntity.status(403).build();
        }
    }

}
