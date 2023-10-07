package creational.abstractFactory.cars;

public class LadaVesta extends Car {
    {
        speed = 80;
        stopDelay = 3;
    }

    @Override
    public void showAdditionalInfo() {
        System.out.println("but its own and not on credit");
    }
}
