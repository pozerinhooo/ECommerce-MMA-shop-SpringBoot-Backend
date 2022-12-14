package com.example.ecommercebackend.controller;

import com.example.ecommercebackend.model.entity.User;
import com.example.ecommercebackend.model.payload.user.UserPayloadResponse;
import com.example.ecommercebackend.service.AuthService;
import com.example.ecommercebackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {
    private final AuthService authService;
    @GetMapping("/current")
    public ResponseEntity<User> getUserData() {
        return ResponseEntity.status(OK)
                .body(authService.getCurrentUser());
    }
}
