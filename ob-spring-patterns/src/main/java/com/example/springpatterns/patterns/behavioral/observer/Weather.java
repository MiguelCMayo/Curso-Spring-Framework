package com.example.springpatterns.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**\
 * Clase que notifica del cambio de tiempo a los observadores
 */

public class Weather {
 
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather(){
        this.observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver obs){
        System.out.println("A�adido obs");
        this.observers.add(obs);
    }

    public void removeObserver(WeatherObserver obs){
        System.out.println("A�adido obs");
        this.observers.remove(obs);
    }

    // cambia el tiempo y notifica a los observadores asociados
    void changeWeather(WeatherType currentWeather){
        this.currentWeather = currentWeather; //cambia
        this.notifyObservers(); //notifica
    }

    // notifica del cambio de tiempo
    private void notifyObservers(){
        //polimorfismo, se tratan los observadores como objetos WeatherObserver
        for (WeatherObserver observer: this.observers) {
            observer.update(this.currentWeather);
        }
    }
}
