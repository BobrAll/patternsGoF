package creational.factoryMethod;

import creational.factoryMethod.developers.Developer;

public class Program {
    public static void main(String[] args) {
        Developer developer = DeveloperSelector.getDeveloper("low level programming");

        developer.writeCode();
    }
}
