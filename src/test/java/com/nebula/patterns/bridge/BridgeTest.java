package com.nebula.patterns.bridge;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class BridgeTest {

    @Test
    public void shapeTest() {
        // 虚线画矩形
        Shape dottedRectangle = new RectangleShape(new DottedLine());
        dottedRectangle.draw();
        // 实线画矩形
        Shape solidRectangle = new RectangleShape(new SolidLine());
        solidRectangle.draw();

        // 虚线画三角形
        Shape  dottedTriangle = new TriangleShape(new DottedLine());
        dottedTriangle.draw();
        // 实线画三角形
        Shape solidTriangle = new RectangleShape(new SolidLine());
        solidTriangle.draw();
    }
}
