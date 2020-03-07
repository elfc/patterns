package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.*;

/**
 *
 * 实现创建具体产品对象操作
 * MBA具体操作
 * ConcreteFactory2
 *
 * @author chunyuliu
 */
public class MBAVendorAbstractFactory implements VendorAbstractFactory {

    @Override
    public Screen createScreen() {
        return new MBAScreen();
    }

    @Override
    public Keyboard createKeyboard() {
        return new MBAKeyboard();
    }
}
