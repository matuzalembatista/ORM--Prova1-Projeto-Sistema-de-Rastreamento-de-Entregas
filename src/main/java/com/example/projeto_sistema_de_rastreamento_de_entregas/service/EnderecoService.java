package com.example.projeto_sistema_de_rastreamento_de_entregas.service;

import org.springframework.stereotype.Service;

import com.example.projeto_sistema_de_rastreamento_de_entregas.model.Endereco;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EnderecoService {

    Endereco endereco;

    public String getEnderecoCompleto() {
        // Retorna o endereço completo formatado.
        String enderecoFormatado = 
             endereco.getRua() + ", " +
                endereco.getNumero() + ", " +
                endereco.getCidade() + ", " +
                endereco.getEstado() + ", " +
                endereco.getCep();

        return enderecoFormatado;
    }

}
