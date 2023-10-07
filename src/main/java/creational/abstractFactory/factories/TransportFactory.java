package creational.abstractFactory.factories;

import creational.abstractFactory.cars.Car;
import creational.abstractFactory.aircrafts.Aircraft;

public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
