package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Screen;

/**
 * MBP 显示器
 * ProductA1
 *
 * @author chunyuliu
 */
public class MBPScreen implements Screen {

    @Override
    public String kind() {
        String msg = "MBP 显示器";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String view() {
        String msg = "分辨率高";
        System.out.println(msg);
        return msg;
    }
}
