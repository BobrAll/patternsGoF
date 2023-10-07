package org.example.structural.decorator.decorators;

import org.example.structural.decorator.components.UiComponent;

public class ColorDecorator extends Decorator {
    public ColorDecorator(UiComponent component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...added color");
    }
}
