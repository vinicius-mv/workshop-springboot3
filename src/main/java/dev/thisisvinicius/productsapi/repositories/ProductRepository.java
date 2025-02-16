package dev.thisisvinicius.productsapi.repositories;

import dev.thisisvinicius.productsapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
