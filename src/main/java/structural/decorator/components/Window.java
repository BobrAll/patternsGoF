package structural.decorator.components;

public class Window implements UiComponent {
    @Override
    public void draw() {
        System.out.println("draw window");
    }
}
