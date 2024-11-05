package com.trainly.app.trainlyapp.services;

import java.util.ArrayList;
import java.util.List;

public class ObserverConcrete implements Observer{
    private String observerState;
    private List<Observer> subscribers = new ArrayList<>();

    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void notificar() {
        for (Observer subscriber : subscribers) {
            subscriber.update(observerState);
        }
    }

    @Override
    public void update(String state) {
        this.observerState = state;
        System.out.println("Estado del observador actualizado a: " + state);
    }
}
