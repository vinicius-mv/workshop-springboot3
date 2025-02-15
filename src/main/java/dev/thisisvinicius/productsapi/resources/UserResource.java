package dev.thisisvinicius.productsapi.resources;

import dev.thisisvinicius.productsapi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User[]> findAll() {
        User u1 = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
        var users = new User[] { u1 };
        return ResponseEntity.ok().body(users);
    }
}
