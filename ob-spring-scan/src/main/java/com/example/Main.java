package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //CONCEPTO 1: Como obtener un bean de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        String texto = calculadora.holaMundo();

        System.out.println(texto);

        //CONCEPTO 2: cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());

        //CONCEPTO 3: scope o alcance
        //los bean por defecto son singleton, se crea el objeto y se utiliza para toda la aplicacion
        //podemos camiarlo a scope="prototype" si queremos que se cree un objeto cada vez
        //verificarlo como se ejecuta varias veces un constructor
    }
}
