package com.example.jpatestes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    private Integer id;

    private String nome;

    private SexoCliente sexo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SexoCliente getSexo() {
        return sexo;
    }

    public void setSexo(SexoCliente sexo) {
        this.sexo = sexo;
    }
}
