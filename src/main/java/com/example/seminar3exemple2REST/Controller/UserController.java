package com.example.seminar3exemple2REST.Controller;

import com.example.seminar3exemple2REST.Domain.User;
import com.example.seminar3exemple2REST.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList(){ return service.getDataProcessingService().getRepository().getUsers();
    }

    @GetMapping
    public String userAddFromBody(@RequestBody User user){
        service.getDataProcessingService().getRepository().getUsers().add(user);
        return "User add from body";
    }
}
