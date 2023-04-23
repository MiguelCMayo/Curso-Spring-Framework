package com.ejercicio2spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService gestor = (UserService) context.getBean("userService");
        System.out.println(gestor.saludo.imprimirSaludo());
    }
}
