package creational.abstractFactory;

import creational.abstractFactory.cars.Car;
import creational.abstractFactory.aircrafts.Aircraft;
import creational.abstractFactory.factories.FranceTransportFactory;
import creational.abstractFactory.factories.RussianTransportFactory;
import creational.abstractFactory.factories.TransportFactory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportFactory transportFactory;

        System.out.println("If you need Russian factory - enter '1'.");
        System.out.println("Else, if you need France factory - enter '2'.");

        switch (scanner.nextInt()) {
            case 1: transportFactory = new RussianTransportFactory(); break;
            case 2: transportFactory = new FranceTransportFactory(); break;
            default: throw new IllegalArgumentException("choose another num");
        }

        Car car = transportFactory.createCar();
        car.drive();
        car.stop();
        car.showAdditionalInfo();

        Aircraft aircraft = transportFactory.createAircraft();
        aircraft.flight();
    }
}
