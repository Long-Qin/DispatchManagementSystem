package com.teamtwo.dispatchmanagementsystem.controller;
import com.teamtwo.dispatchmanagementsystem.model.User;
import com.teamtwo.dispatchmanagementsystem.service.RegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }
    @PostMapping("/register")
    public String addUser(@RequestBody User user){
        Logger logger = LoggerFactory.getLogger((RegisterController.class));
        logger.info(user.getUsername());
        registerService.add(user);
        return "Registration success";
    }
}
