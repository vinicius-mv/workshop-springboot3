package dev.thisisvinicius.productsapi.repositories;

import dev.thisisvinicius.productsapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
