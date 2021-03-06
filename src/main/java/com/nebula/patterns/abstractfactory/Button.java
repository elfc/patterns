package com.nebula.patterns.abstractfactory;

/**
 * 按钮接口
 * AbstractProductA
 * @author chunyuliu
 */
public interface Button {

    /**
     * 风格
     * @return
     */
    String style();

    /**
     * 点击
     * @return
     */
    String click();
}
