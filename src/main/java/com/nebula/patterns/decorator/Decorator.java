package com.nebula.patterns.decorator;

/**
 * @author chunyuliu
 */
public class Decorator implements VisualComponent {

    private VisualComponent visualComponent;

    public Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    @Override
    public void draw() {
        this.visualComponent.draw();
    }
}
