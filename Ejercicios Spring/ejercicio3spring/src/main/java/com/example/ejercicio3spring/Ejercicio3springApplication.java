package com.example.ejercicio3spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3springApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio3springApplication.class, args);

		SmartphoneRepository repository = context.getBean(SmartphoneRepository.class);

		Smartphone phone1 = new Smartphone(null,"Samsung","Galaxy S22",228,"Negro");
		repository.save(phone1);
		Smartphone phone2 = new Smartphone(null,"Apple","Iphone 13",173,"Blanco");
		repository.save(phone2);

		System.out.println("El numero de smartphones en base de datos es: " + repository.count());

		System.out.println(repository.findAll());







	}

}
