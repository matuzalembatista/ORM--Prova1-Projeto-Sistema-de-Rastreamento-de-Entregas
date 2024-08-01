package com.example.projeto_sistema_de_rastreamento_de_entregas.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pacote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    private String destinatario;
    
    @ManyToOne
    private Endereco endereco;
    private String status;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rastreamento> historicoRastreamento = new ArrayList<>();

}
