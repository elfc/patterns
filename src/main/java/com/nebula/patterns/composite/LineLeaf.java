package com.nebula.patterns.composite;

/**
 * @author chunyuliu
 */
public class LineLeaf extends GraphicComponent {

    @Override
    public void draw() {
        System.out.println("LineLeaf draw");
    }
}
