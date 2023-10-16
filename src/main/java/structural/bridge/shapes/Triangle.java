package structural.bridge.shapes;

import structural.bridge.colors.Colorable;

public class Triangle extends Shape {
    public Triangle(Colorable color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
        color.fillColor();
    }
}
