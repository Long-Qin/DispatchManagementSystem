package com.teamtwo.dispatchmanagementsystem.controller;
import com.teamtwo.dispatchmanagementsystem.model.User;
import com.teamtwo.dispatchmanagementsystem.service.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }
    @PostMapping("/register/")
    public void addUser(@RequestBody User user){
        registerService.add(user);
    }
}
