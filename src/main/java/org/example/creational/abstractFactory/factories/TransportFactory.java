package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.aircrafts.Aircraft;
import org.example.creational.abstractFactory.cars.Car;

public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
