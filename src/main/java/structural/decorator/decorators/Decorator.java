package structural.decorator.decorators;

import structural.decorator.components.UiComponent;

public abstract class Decorator implements UiComponent {
    protected UiComponent component;

    Decorator(UiComponent component) {
        this.component = component;
    }

    public abstract void afterDraw();

    public void draw() {
        component.draw();
        afterDraw();
    }
}
