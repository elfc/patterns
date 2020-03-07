package com.nebula.patterns.abstractfactory;

/**
 * 一个创建抽象产品对象的操作接口
 * 假设某厂商抽象工厂, 可以生成显示器也可以生产键盘或其他
 * AbstractFactory
 *
 * @author chunyuliu
 */
public interface VendorAbstractFactory {

    /**
     * 生产显示器
     * CreateProductA
     * @return
     */
    Screen createScreen();

    /**
     * 生产键盘
     * CrateProductB
     * @return
     */
    Keyboard createKeyboard();
}
