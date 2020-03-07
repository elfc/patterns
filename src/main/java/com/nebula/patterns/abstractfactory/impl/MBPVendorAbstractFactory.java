package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.*;

/**
 *
 * 实现创建具体产品对象操作
 * MBP具体操作
 * ConcreteFactory1
 *
 * @author chunyuliu
 */
public class MBPVendorAbstractFactory implements VendorAbstractFactory {

    @Override
    public Screen createScreen() {
        return new MBPScreen();
    }

    @Override
    public Keyboard createKeyboard() {
        return new MBPKeyboard();
    }
}
