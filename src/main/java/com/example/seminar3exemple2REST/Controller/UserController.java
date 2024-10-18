package com.example.seminar3exemple2REST.Controller;

import com.example.seminar3exemple2REST.Domain.User;
import com.example.seminar3exemple2REST.Service.RegistrationService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Getter
@Setter
public class UserController {

    private final RegistrationService registrationService;

    @GetMapping
    public String userList(Model model){
        model.addAttribute("user", registrationService.getDataProcessingService().getRepository().getUsers());
        return "users";

    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){
        registrationService
                .getDataProcessingService()
                .getRepository()
                .getUsers()
                .add(user);
        return "User add from body";
    }
}
