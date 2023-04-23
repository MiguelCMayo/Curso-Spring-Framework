package com.example.springpatterns.patterns.behavioral.observer;

public class Main {

	public static void main(String[] args) {

        //1. Se crea la clase principal, la que cambia de estado y que los observadores quieren seguir
        Weather aemet = new Weather();

        //2. Se crean los observadores y se añaden a la clase principal para que puedan ser notificados cuando haya cambios

        //computer
        WeatherObserver computer = new Computer();
        aemet.addObserver(computer);
        //smartphone
        aemet.addObserver(new SmartPhone());

        //Cambio del tiempo --> notifica automaticamente a los observadores
        aemet.changeWeather(WeatherType.CLOUDY);
        aemet.changeWeather(WeatherType.RAINY);
        aemet.changeWeather(WeatherType.SUNNY);

        aemet.removeObserver(computer);
        aemet.changeWeather(WeatherType.SUNNY);
	}
}
