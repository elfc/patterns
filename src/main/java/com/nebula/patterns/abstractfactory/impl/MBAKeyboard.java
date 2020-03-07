package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Keyboard;

/**
 *
 * MBA 键盘
 * ProductB2
 *
 * @author chunyuliu
 */
public class MBAKeyboard implements Keyboard {

    @Override
    public String kind() {
        String msg = "MBA 键盘";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String press() {
        String msg = "我没有 TouchBar";
        System.out.println(msg);
        return msg;
    }
}
