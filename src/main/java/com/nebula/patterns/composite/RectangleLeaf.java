package com.nebula.patterns.composite;

/**
 * @author chunyuliu
 */
public class RectangleLeaf extends GraphicComponent {

    @Override
    public void draw() {
        System.out.println("RectangleLeaf draw");
    }
}
