package com.example.controlwork.controller;

import com.example.controlwork.model.User;
import com.example.controlwork.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String userName) {
        Optional<User> user = userRepository.findByUserName(userName);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get().getUserId());
        }
        return ResponseEntity.status(401).body("User not found");
    }
}