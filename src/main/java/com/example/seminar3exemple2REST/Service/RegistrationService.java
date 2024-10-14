package com.example.seminar3exemple2REST.Service;

import com.example.seminar3exemple2REST.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public void processRegistration(String name, int age, String email){
        User createUser = userService.createUser(name, age, email);
        getDataProcessingService().addUser(createUser);
        notificationService.notifyUser(createUser);
    }
}
