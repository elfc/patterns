package com.nebula.patterns.composite;

/**
 * @author chunyuliu
 */
public class TextLeaf extends GraphicComponent {

    @Override
    public void draw() {
        System.out.println("TextLeaf draw");
    }
}
