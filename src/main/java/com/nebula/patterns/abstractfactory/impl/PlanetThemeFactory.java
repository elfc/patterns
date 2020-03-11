package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.*;

/**
 *
 * 实现创建具体产品对象操作
 * ConcreteFactory1
 *
 * @author chunyuliu
 */
public class PlanetThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new PlanetButton();
    }

    @Override
    public Menu createMenu() {
        return new PlanetMenu();
    }
}
