package structural.bridge;

import structural.bridge.colors.BlackColor;
import structural.bridge.shapes.Triangle;

public class Program {
    //Класс Shape - абстракция
    //Интерфейс Colorable - реализация
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new BlackColor());
        triangle.draw();
    }
}
