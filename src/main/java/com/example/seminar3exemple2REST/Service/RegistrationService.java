package com.example.seminar3exemple2REST.Service;

import com.example.seminar3exemple2REST.Domain.User;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Getter
@Service
public class RegistrationService {

    private UserService userService;
    private DataProcessingService dataProcessingService;
    private NotificationService notificationService;

    public RegistrationService(UserService userService, DataProcessingService dataProcessingService, NotificationService notificationService) {
        this.userService = userService;
        this.dataProcessingService = dataProcessingService;
        this.notificationService = notificationService;
    }

    public void processRegistration(User user){
        userService.createUser(user.getName(), user.getAge(), user.getEmail());

    }


}
