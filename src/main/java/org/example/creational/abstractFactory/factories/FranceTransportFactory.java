package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.aircrafts.Aircraft;
import org.example.creational.abstractFactory.aircrafts.FarmanF50;
import org.example.creational.abstractFactory.cars.Car;
import org.example.creational.abstractFactory.cars.RenaultLogan;

public class FranceTransportFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new RenaultLogan();
    }

    @Override
    public Aircraft createAircraft() {
        return new FarmanF50();
    }
}
