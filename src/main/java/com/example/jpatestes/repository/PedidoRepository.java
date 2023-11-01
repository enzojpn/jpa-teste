package com.example.jpatestes.repository;

import com.example.jpatestes.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido ,Integer > {
}
