package com.nebula.patterns.bridge;

/**
 * @author chunyuliu
 */
public abstract class Shape {

    protected Line line;

    public Shape(Line line) {
        this.line = line;
    }

    public abstract void draw();
}
