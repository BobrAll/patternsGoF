package structural.bridge.shapes;

import structural.bridge.colors.Colorable;

public abstract class Shape {
    protected Colorable color;

    public Shape(Colorable color) {
        this.color = color;
    }

    public abstract void draw();
}
