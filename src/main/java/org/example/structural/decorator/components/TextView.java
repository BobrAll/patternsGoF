package org.example.structural.decorator.components;

public class TextView implements UiComponent {
    @Override
    public void draw() {
        System.out.println("draw textview");
    }
}
