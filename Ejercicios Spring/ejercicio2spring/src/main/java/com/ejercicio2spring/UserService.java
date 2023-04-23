package com.ejercicio2spring;

import org.springframework.stereotype.Component;
@Component
public class UserService {

    NotificationService saludo;

    public UserService(NotificationService saludo){
        System.out.println("Ejecutando constructor UserService");
        this.saludo = saludo;
    }
}
