package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Keyboard;

/**
 *
 * MBP 键盘
 * ProductB1
 *
 * @author chunyuliu
 */
public class MBPKeyboard implements Keyboard {

    @Override
    public String kind() {
        String msg = "MBP 键盘";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String press() {
        String msg = "我有 TouchBar";
        System.out.println(msg);
        return msg;
    }
}
