package com.nebula.patterns.decorator;

/**
 * @author chunyuliu
 */
public class TextView implements VisualComponent {

    @Override
    public void draw() {
        System.out.println("TextView");
    }
}
