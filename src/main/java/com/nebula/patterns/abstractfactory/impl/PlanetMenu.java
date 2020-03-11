package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Menu;

/**
 *
 * 地球主题菜单
 * ProductB1
 *
 * @author chunyuliu
 */
public class PlanetMenu implements Menu {

    @Override
    public String style() {
        String msg = "我是地球主题菜单";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String layout() {
        String msg = "地球主题菜单布局";
        System.out.println(msg);
        return msg;
    }
}
