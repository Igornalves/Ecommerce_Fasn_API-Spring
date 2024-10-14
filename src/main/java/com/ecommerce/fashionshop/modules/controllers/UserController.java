package com.ecommerce.fashionshop.modules.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.fashionshop.modules.dto.UserDTO;
import com.ecommerce.fashionshop.modules.dto.LoginDTO;
import com.ecommerce.fashionshop.model.User;
import com.ecommerce.fashionshop.modules.services.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody UserDTO userDTO) {
        User registeredUser = userService.registerUser(userDTO);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@Valid @RequestBody LoginDTO loginDTO) {
        User loggedUser = userService.loginUser(loginDTO);
        return new ResponseEntity<>(loggedUser, HttpStatus.OK);
    }
}