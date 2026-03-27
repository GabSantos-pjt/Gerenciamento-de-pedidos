package com.gerenciamentopedidos.repository;

import com.gerenciamentopedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}