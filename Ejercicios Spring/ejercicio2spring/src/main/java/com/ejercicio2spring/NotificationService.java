package com.ejercicio2spring;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Ejecutando constructor CalculatorService");
    }

    public String imprimirSaludo(){
        return "Hola mundo";

    }

}
