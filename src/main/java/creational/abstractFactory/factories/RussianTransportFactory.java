package creational.abstractFactory.factories;

import creational.abstractFactory.cars.Car;
import creational.abstractFactory.cars.LadaVesta;
import creational.abstractFactory.aircrafts.Aircraft;
import creational.abstractFactory.aircrafts.Tu134;

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
