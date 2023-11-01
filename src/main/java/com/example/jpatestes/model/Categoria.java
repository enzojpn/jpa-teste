package com.example.jpatestes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categoria {

    @Id
    private Integer id;

    private String nome;
    private Integer categoriaPaiId;


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

    public Integer getCategoriaPaiId() {
        return categoriaPaiId;
    }

    public void setCategoriaPaiId(Integer categoriaPaiId) {
        this.categoriaPaiId = categoriaPaiId;
    }
}
