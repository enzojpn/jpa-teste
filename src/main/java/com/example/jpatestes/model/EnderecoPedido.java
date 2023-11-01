package com.example.jpatestes.model;


import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoPedido {

    private String logradouro;

    private String numero;

    private String bairro;

    //TODO resto do endereco


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
