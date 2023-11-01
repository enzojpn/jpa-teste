package com.example.jpatestes.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Pedido {

    @Id
    private Integer id;


    private LocalDateTime dataPedido;
    private LocalDateTime dataConclusao;

    private Integer notaFiscalId;

    private BigDecimal total;


    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    @Embedded
    private EnderecoPedido enderecoPedido;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Integer getNotaFiscalId() {
        return notaFiscalId;
    }

    public void setNotaFiscalId(Integer notaFiscalId) {
        this.notaFiscalId = notaFiscalId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public EnderecoPedido getEnderecoPedido() {
        return enderecoPedido;
    }

    public void setEnderecoPedido(EnderecoPedido enderecoPedido) {
        this.enderecoPedido = enderecoPedido;
    }
}

