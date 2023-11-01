package com.example.jpatestes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class NotaFiscal {

    @Id
    private Integer id;


    private Integer pedidoId;

    private String xml;

    private Date dataEmissao;

}