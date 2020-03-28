package com.nebula.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chunyuliu
 */
public class PictureComposite extends GraphicComponent {

    private List<GraphicComponent> childList = new ArrayList<GraphicComponent>();

    @Override
    public void add(GraphicComponent graphicComponent) {
        childList.add(graphicComponent);
    }

    @Override
    public void remove(GraphicComponent graphicComponent) {
        childList.remove(graphicComponent);
    }

    @Override
    public void draw() {
        System.out.println("PictureComposite");
        if (childList != null && childList.size() > 0) {
            for (GraphicComponent graphicComponent : childList) {
                graphicComponent.draw();
            }
        }
    }

    @Override
    public GraphicComponent getChild(int index) {
        if (childList == null || childList.size() <= index) {
            return null;
        }

        return childList.get(index);
    }
}
