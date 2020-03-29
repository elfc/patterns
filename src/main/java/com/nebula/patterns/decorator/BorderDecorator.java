package com.nebula.patterns.decorator;

/**
 * @author chunyuliu
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {
        drawBorder();
        super.draw();
    }

    private void drawBorder() {
        System.out.println("边框");
    }
}
