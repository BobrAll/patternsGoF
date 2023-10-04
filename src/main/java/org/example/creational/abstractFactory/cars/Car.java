package org.example.creational.abstractFactory.cars;

public abstract class Car {
    protected int speed;
    protected int stopDelay;

    public abstract void showAdditionalInfo();

    public void drive() {
        System.out.println("driving speed " + speed + "km/h");
    }

    public void stop() {
        System.out.println("stopped with delay " + stopDelay + " seconds");
    }
}
