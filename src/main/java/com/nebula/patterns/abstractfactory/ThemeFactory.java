package com.nebula.patterns.abstractfactory;

/**
 * 一个创建抽象产品对象的操作接口
 * AbstractFactory
 *
 * @author chunyuliu
 */
public interface ThemeFactory {

    /**
     * 新建按钮
     * CreateProductA
     * @return
     */
    Button createButton();

    /**
     * 新建菜单
     * CrateProductB
     * @return
     */
    Menu createMenu();
}
