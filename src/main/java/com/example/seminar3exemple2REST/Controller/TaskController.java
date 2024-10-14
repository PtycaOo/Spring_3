package com.example.seminar3exemple2REST.Controller;

import com.example.seminar3exemple2REST.Domain.User;
import com.example.seminar3exemple2REST.Service.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTask(){
        List<String> task = new ArrayList<>();
        task.add("sort");
        task.add("filter");
        task.add("calc");
        return task;
    }

    @GetMapping("/sort")
    public List<User> sortUserByAge(){
        return service.sortUsersByAge(service.getRepository().getUsers());
    }

    @GetMapping
    public List<User> filterUserByAge(int age){
        return service.filterUsersByAge(service.getRepository().getUsers(), age);
    }

    public double calculateAverageAge(){
        return service.calculateAverageAge(service.getRepository().getUsers());
    }


}
