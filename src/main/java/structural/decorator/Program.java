package structural.decorator;

import structural.decorator.components.UiComponent;
import structural.decorator.components.Window;
import structural.decorator.decorators.BorderDecorator;
import structural.decorator.decorators.ColorDecorator;
import structural.decorator.decorators.Decorator;

public class Program {
    public static void main(String[] args) {
        UiComponent window = new Window();
        Decorator borderWindow = new BorderDecorator(window);
        Decorator borderColorWindow = new ColorDecorator(borderWindow);

        borderColorWindow.draw();
    }
}
