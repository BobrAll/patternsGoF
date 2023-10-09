package structural.facade;

import structural.facade.parts.Door;
import structural.facade.parts.Engine;
import structural.facade.parts.Wheel;

public class Program {
    public static void main(String[] args) {
        //Without facade
        Door door = new Door();
        Engine engine = new Engine();
        Wheel wheel = new Wheel();

        door.open();
        engine.start();
        wheel.turn();

        //With facade
        System.out.println();
        CarFacade facade = new CarFacade();
        facade.go();
    }
}
