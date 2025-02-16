package dev.thisisvinicius.productsapi.repositories;

import dev.thisisvinicius.productsapi.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
