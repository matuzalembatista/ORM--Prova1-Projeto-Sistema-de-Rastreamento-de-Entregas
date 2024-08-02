package com.example.projeto_sistema_de_rastreamento_de_entregas.service;

import org.springframework.stereotype.Service;

import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Pacote;
import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Rastreamento;

@Service
public class RastreamentoService {
    
    Rastreamento rastreamento;
    Pacote pacote;
   

    public String getResumo(){
        // - Retorna um resumo das informações de rastreamento.
      
        String resumo = 
        rastreamento.getId()  + ", " +
        rastreamento.getPacote()  + ", " +
        rastreamento.getDataHora()  + ", " +
        rastreamento.getLocalizacao()  + ", " +
        rastreamento.getStatus();
      
        return  resumo;
    }


}
