package com.example.jpatestes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estoque {

    @Id
    private Integer id;

    private Integer produtoId;
    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
