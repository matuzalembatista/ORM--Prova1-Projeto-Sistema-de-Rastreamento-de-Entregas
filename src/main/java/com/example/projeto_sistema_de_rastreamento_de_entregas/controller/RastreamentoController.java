package com.example.projeto_sistema_de_rastreamento_de_entregas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Rastreamento;
import com.example.projeto_sistema_de_rastreamento_de_entregas.repository.RastreamentoRepository;
import com.example.projeto_sistema_de_rastreamento_de_entregas.service.RastreamentoService;

@RestController
@RequestMapping("/rastreamentos")
public class RastreamentoController {

    private RastreamentoRepository rastreamentoRepository;

    // - GET /rastreamentos/{id} - Consulta todos os rastreamentos de um pacote
    // específico.
    @GetMapping("/")
    public List<Rastreamento> getRastreamentosByPacoteId(@PathVariable String pacoteId) {
        return rastreamentoRepository.findByPacoteId(pacoteId);
    }
}
