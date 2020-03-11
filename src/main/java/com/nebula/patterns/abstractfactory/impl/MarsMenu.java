package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Menu;

/**
 *
 * 火星主题菜单
 * ProductB2
 *
 * @author chunyuliu
 */
public class MarsMenu implements Menu {

    @Override
    public String style() {
        String msg = "我是火星主题菜单";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String layout() {
        String msg = "火星主题菜单布局";
        System.out.println(msg);
        return msg;
    }
}
