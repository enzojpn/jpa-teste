package com.example.jpatestes.controller;

import com.example.jpatestes.model.Pedido;
import com.example.jpatestes.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping
    public Pedido gravar(@RequestBody Pedido pedido){

        return pedidoRepository.save(pedido);
    }

    @GetMapping
    public List<Pedido> listar(){
        return pedidoRepository.findAll();
    }
}
