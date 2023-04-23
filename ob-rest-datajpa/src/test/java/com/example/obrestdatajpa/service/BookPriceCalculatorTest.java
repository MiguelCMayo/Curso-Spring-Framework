package com.example.obrestdatajpa.service;

import com.example.obrestdatajpa.entities.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest {

    @Test
    void calculatePrice() {

        //CONFIGURACION DEL TEST
        Book book = new Book(1L,"El señor de los anillos","Author", 1000, 49.99, LocalDate.now(),true);
        BookPriceCalculator calculator = new BookPriceCalculator();

        // SE EJECUTA EL COMPORTAMIENTO A TESTEAR
        double price = calculator.calculatePrice(book);
        System.out.println(price);

        //REALIZAMOS LAS ASERCIONES
        assertTrue(price > 0);
        assertEquals(57.980000000000004,price);

    }
}