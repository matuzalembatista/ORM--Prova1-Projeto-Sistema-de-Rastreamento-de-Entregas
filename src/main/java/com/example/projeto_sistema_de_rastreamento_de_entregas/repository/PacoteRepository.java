package com.example.projeto_sistema_de_rastreamento_de_entregas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Pacote;

@Repository
public interface PacoteRepository extends JpaRepository<Pacote, Long>{
    
}
