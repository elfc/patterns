package com.nebula.patterns.composite;

/**
 * @author chunyuliu
 */
public abstract class GraphicComponent {

    /**
     * 叶子及组合结点都实现的方法
     */
    public abstract void draw();

    /**
     * 添加叶子结点方法
     * 透明模式叶子结点不需要实现add方法, 默认实现
     * @param graphicComponent
     */
    public void add(GraphicComponent graphicComponent) {
        throw new UnsupportedOperationException("Object UnsupportedOperation add method");
    }

    /**
     * 删除叶子结点方法
     * 透明模式叶子结点不需要实现remove方法, 默认实现
     * @param graphicComponent
     */
    public void remove(GraphicComponent graphicComponent) {
        throw new UnsupportedOperationException("Object UnsupportedOperation remove method");
    }

    /**
     * 获取叶子结点方法
     * @param index 叶子结点索引
     * @return
     */
    public GraphicComponent getChild(int index) {
        throw new UnsupportedOperationException("Object UnsupportedOperation getChild method");
    }
}
