package dev.thisisvinicius.productsapi.repositories;

import dev.thisisvinicius.productsapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
