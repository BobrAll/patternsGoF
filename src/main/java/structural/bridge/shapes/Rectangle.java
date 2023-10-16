package structural.bridge.shapes;

import structural.bridge.colors.Colorable;

public class Rectangle extends Shape {
    public Rectangle(Colorable color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        color.fillColor();
    }
}
