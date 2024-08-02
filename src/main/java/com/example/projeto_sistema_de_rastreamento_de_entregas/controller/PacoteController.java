package com.example.projeto_sistema_de_rastreamento_de_entregas.controller;

import java.util.List;

import org.hibernate.Remove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Pacote;
import com.example.projeto_sistema_de_rastreamento_de_entregas.repository.PacoteRepository;
import com.example.projeto_sistema_de_rastreamento_de_entregas.service.PacoteService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {

    @Autowired
    private PacoteService pacoteService;
    private PacoteRepository pacoteRepository;

    // - GET /pacotes - Consulta todos os pacotes.
    @GetMapping
    public List<Pacote> getAllPacotes() {
        return pacoteRepository.findAll();
    }

    // - POST /pacotes - Adiciona um novo pacote.
    @PostMapping()
    public String newPacote(@RequestBody Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    // - GET /pacotes/{id} - Consulta um pacote específico.
    @GetMapping("/id")
    public ResponseEntity<Pacote> getPacoteById(@RequestParam String id) {
        Pacote pacote = pacoteRepository.findById(id);

        return ResponseEntity.ok(pacote);
    }

    // - PUT /pacotes/{id} - Atualiza as informações de um pacote.
    @PutMapping("/{id}")
    public ResponseEntity<Pacote> putMethodName(@PathVariable String id, @RequestBody Pacote pacote) {
        Pacote atualizarPacote = pacoteService.atualizarStatus(id, null, id);

        return ResponseEntity.ok(atualizarPacote);
    }

    // - DELETE /pacotes/{id} - Remove um pacote.
    @DeleteMapping("/{id}")
    public void deletePacote(@PathVariable Pacote id) {
        pacoteRepository.delete(id);
    }

}
