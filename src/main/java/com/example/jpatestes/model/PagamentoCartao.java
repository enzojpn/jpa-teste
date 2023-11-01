package com.example.jpatestes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PagamentoCartao {

    @Id
    private Integer id;

    private Integer pedidoId;

    private StatusPagamento
            status;

    private String numero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}