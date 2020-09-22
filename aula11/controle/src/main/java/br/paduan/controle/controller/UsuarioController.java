package br.paduan.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.controle.dao.UsuarioDAO;
import br.paduan.controle.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos() {
        List<Usuario> lista = (List<Usuario>) dao.findAll();
        return lista;
    }

    @PostMapping("/usuario/login")
    public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario user) {
        Usuario userFinded = dao.findByEmailOrCpf(user.getEmail(), user.getCpf());

        if (userFinded != null) {
            if (userFinded.getSenha().equals(user.getSenha())) {
                userFinded.setChamados(null);
                userFinded.setSenha("******");

                return ResponseEntity.ok(userFinded);
            }
        }
        return ResponseEntity.status(403).build();

    }

    @PostMapping ("/usuario/login/email")
    public ResponseEntity<Usuario> fazerLoginPorEmail (@RequestBody Usuario user){
        Usuario usuario = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
        if(usuario !=null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.status(403).build();
        }
    }
    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarPorID (@PathVariable int id){
        Usuario usuario = dao.buscaUsuarioPorId(id);
        if(usuario !=null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.status(404).build();
        }
    }
    @GetMapping("/usuario/nativo/{id}")
    public ResponseEntity<Object[]> buscarPorIDNativo (@PathVariable int id){
        Object [] usuario = dao.buscarUsuarioPorIdNativo(id);
        if(usuario !=null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.status(404).build();
        }
    }
}
