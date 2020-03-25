package com.nebula.patterns.bridge;

/**
 * RefinedAbstraction
 * @author chunyuliu
 */
public class RectangleShape extends Shape {

    public RectangleShape(Line line) {
        super(line);
    }

    @Override
    public void draw() {
        System.out.println("矩形, 线样式: " + line.style());
    }
}
