package com.example.projeto_sistema_de_rastreamento_de_entregas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Endereco;
import com.example.projeto_sistema_de_rastreamento_de_entregas.service.EnderecoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    //    - GET /enderecos - Consulta todos os endereços.
    @GetMapping
    public List<Endereco> getAllEnderecos() {
        return enderecoService.findAll();
    }


    //    - POST /enderecos - Adiciona um novo endereço.
    @PostMapping("path")
    public void newEndereco(@RequestBody Endereco endereco ) {
        return enderecoService.save(endereco);
    }
    
}
