package structural.facade;

import structural.facade.parts.Door;
import structural.facade.parts.Engine;
import structural.facade.parts.Wheel;

public class CarFacade {
    private Door door = new Door();
    private Engine engine = new Engine();
    private Wheel wheel = new Wheel();

    public void go() {
        door.open();
        engine.start();
        wheel.turn();
    }
}
