package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.aircrafts.Aircraft;
import org.example.creational.abstractFactory.aircrafts.Tu134;
import org.example.creational.abstractFactory.cars.Car;
import org.example.creational.abstractFactory.cars.LadaVesta;

public class RussianTransportFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new LadaVesta();
    }

    @Override
    public Aircraft createAircraft() {
        return new Tu134();
    }
}
