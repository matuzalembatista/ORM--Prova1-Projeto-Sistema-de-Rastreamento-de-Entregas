package com.example.projeto_sistema_de_rastreamento_de_entregas.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Pacote;
import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Rastreamento;

@Service
public class PacoteService {

    RastreamentoService rastreamentoService;
    Rastreamento rastreamento;
    Pacote pacote;
    
    public void atualizarStatus(String novoStatus, Date dataHora, String localizacao){
        // Atualiza o status do pacote e registra o rastreamento.
        rastreamento.setStatus(novoStatus);

        Rastreamento rastreamento = new Rastreamento(null, dataHora, novoStatus, localizacao, null){
            this.historicoRastreamento.add(rastreamento);
        }
    }

    public String consultarInformacoes(){
         // Retorna todas as informações do pacote, incluindo o status atual e rastreamento histórico.
         
        String informacaoCompleta = 
            pacote.getId() + ", " + 
            pacote.getDestinatario()+ ", " +
            pacote.getEndereco() + ", " + 
            pacote.getStatus();

        return informacaoCompleta;
       
    }




}
