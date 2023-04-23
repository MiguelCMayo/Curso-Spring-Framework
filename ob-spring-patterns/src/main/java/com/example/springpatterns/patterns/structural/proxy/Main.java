package com.example.springpatterns.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {

        Image img = new ProxyImage("holamundo.jpg");

        //el proxy crea el objeto real por debajo la primera vez
        img.show();
        System.out.println("-----");

        //el proxy ya tiene el objeto real crado, no lo crea de nuevo
        img.show();
    }
}
