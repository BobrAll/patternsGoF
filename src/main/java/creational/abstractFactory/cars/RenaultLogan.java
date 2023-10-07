package creational.abstractFactory.cars;

public class RenaultLogan extends Car {
    {
        speed = 100;
        stopDelay = 2;
    }

    @Override
    public void showAdditionalInfo() {
        System.out.println("there is a heated seat in your configuration");
    }
}
