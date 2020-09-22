package br.paduan.controle.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
//import antlr.collections.List;
import br.paduan.controle.dao.AtividadeDAO;
import br.paduan.controle.model.Atividade;

@RestController
@CrossOrigin("*")

public class AtividadeController {
    @Autowired
    private AtividadeDAO dao;

    @GetMapping("/atividade")
    public List<Atividade> getMethodName(){
        return(List<Atividade>) dao.findAll();

    }
    @PostMapping("/atividade/nova")
    public ResponseEntity<Atividade> postMethodName (@RequestBody Atividade atividade){
        Atividade novaAtividade = dao.save(atividade);
        if(novaAtividade != null){
            return ResponseEntity.ok(novaAtividade);
        }
        return ResponseEntity.badRequest().build();
    }
}
