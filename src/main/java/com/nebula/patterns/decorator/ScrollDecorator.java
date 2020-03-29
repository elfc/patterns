package com.nebula.patterns.decorator;

/**
 * @author chunyuliu
 */
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {
        scrollTo();
        super.draw();
    }

    private void scrollTo() {
        System.out.println("滚动条");
    }
}
