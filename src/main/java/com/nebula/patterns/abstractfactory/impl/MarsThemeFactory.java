package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.*;

/**
 *
 * 实现创建具体产品对象操作
 * ConcreteFactory2
 *
 * @author chunyuliu
 */
public class MarsThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new MarsButton();
    }

    @Override
    public Menu createMenu() {
        return new MarsMenu();
    }
}
