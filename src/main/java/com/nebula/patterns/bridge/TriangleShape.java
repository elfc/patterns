package com.nebula.patterns.bridge;

/**
 * RefinedAbstraction
 * @author chunyuliu
 */
public class TriangleShape extends Shape {

    public TriangleShape(Line line) {
        super(line);
    }

    @Override
    public void draw() {
        System.out.println("三角形, 线样式: " + line.style());
    }
}
