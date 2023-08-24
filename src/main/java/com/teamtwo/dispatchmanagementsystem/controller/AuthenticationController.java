package com.teamtwo.dispatchmanagementsystem.controller;

import com.teamtwo.dispatchmanagementsystem.model.Token;
import com.teamtwo.dispatchmanagementsystem.model.User;

import com.teamtwo.dispatchmanagementsystem.service.AuthenticationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/authenticate")
    public Token authenticateGuest(@RequestBody User user) {
        return authenticationService.authenticate(user);
    }


}

