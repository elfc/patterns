package com.nebula.patterns.composite;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class CompositeTest {

    @Test
    public void graphicTest() {
        // 子部件
        GraphicComponent pictureComposite = new PictureComposite();
        // 组合叶子部件
        pictureComposite.add(new LineLeaf());
        pictureComposite.add(new RectangleLeaf());
        pictureComposite.add(new TextLeaf());
        GraphicComponent subPictureComposite = new PictureComposite();
        subPictureComposite.add(new LineLeaf());
        subPictureComposite.add(new RectangleLeaf());
        subPictureComposite.add(new TextLeaf());

        pictureComposite.add(subPictureComposite);

        pictureComposite.draw();

        // 获取叶子结点
        System.out.println("RectangleLeaf: " + pictureComposite.getChild(1));
    }
}
