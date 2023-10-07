package creational.abstractFactory.factories;

import creational.abstractFactory.cars.Car;
import creational.abstractFactory.cars.RenaultLogan;
import creational.abstractFactory.aircrafts.Aircraft;
import creational.abstractFactory.aircrafts.FarmanF50;

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
