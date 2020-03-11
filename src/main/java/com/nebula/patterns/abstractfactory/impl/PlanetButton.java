package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Button;

/**
 * 地球主题按钮
 * ProductA1
 *
 * @author chunyuliu
 */
public class PlanetButton implements Button {

    @Override
    public String style() {
        String msg = "我是地球主题按钮";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String click() {
        String msg = "点击我会显示地球";
        System.out.println(msg);
        return msg;
    }
}
