package com.example.seminar3exemple2REST.Service;

import com.example.seminar3exemple2REST.Domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.name());
    }

}
