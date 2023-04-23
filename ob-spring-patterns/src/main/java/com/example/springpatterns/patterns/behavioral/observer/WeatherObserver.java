package com.example.springpatterns.patterns.behavioral.observer;

//representa un observador
public interface WeatherObserver {

    //Actualiza el estado del observador con la nueva informacion notificada desde la clase que cambia
    void update(WeatherType type);
}
