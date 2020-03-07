package com.nebula.patterns.abstractfactory;

/**
 * 键盘接口
 * AbstractProductB
 * @author chunyuliu
 */
public interface Keyboard {

    /**
     * 类别
     * @return
     */
    String kind();

    /**
     * 可以敲键盘
     * @return
     */
    String press();
}
