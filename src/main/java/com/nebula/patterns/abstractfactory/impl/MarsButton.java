package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Button;

/**
 * 火星主题按钮
 * ProductA2
 *
 * @author chunyuliu
 */
public class MarsButton implements Button {

    @Override
    public String style() {
        String msg = "我是火星主题按钮";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String click() {
        String msg = "点击我会显示火星";
        System.out.println(msg);
        return msg;
    }
}
