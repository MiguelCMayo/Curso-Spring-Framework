package com.example.ejercicio3spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fabricante;
    private String modelo;
    private double peso;
    private String color;

    public Smartphone() {
    }

    public Smartphone(Long id, String fabricante, String modelo, double peso, String color) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                '}';
    }
}
