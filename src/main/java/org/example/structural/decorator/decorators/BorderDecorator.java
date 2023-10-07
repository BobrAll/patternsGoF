package org.example.structural.decorator.decorators;

import org.example.structural.decorator.components.UiComponent;

public class BorderDecorator extends Decorator {
    public BorderDecorator(UiComponent component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...added border");
    }
}
