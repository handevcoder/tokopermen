package com.hanif.portofolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User UserRegister(@RequestBody RegistrationRequest request) {
        return userService.registerUser(request.getUsername(), request.getPassword());
    }

    @PostMapping("/login")
    public ResponseEntity<?> UserLogin(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(userService.loginUser(request.getUsername(), request.getPassword()));
    }
}
