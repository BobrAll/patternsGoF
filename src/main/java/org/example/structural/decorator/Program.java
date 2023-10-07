package org.example.structural.decorator;

import org.example.structural.decorator.components.UiComponent;
import org.example.structural.decorator.components.Window;
import org.example.structural.decorator.decorators.BorderDecorator;
import org.example.structural.decorator.decorators.ColorDecorator;
import org.example.structural.decorator.decorators.Decorator;

public class Program {
    public static void main(String[] args) {
        UiComponent window = new Window();
        Decorator borderWindow = new BorderDecorator(window);
        Decorator borderColorWindow = new ColorDecorator(borderWindow);

        borderColorWindow.draw();
    }
}
