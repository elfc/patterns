package com.nebula.patterns.abstractfactory.impl;

import com.nebula.patterns.abstractfactory.Screen;

/**
 * MBA 显示器
 * ProductA2
 *
 * @author chunyuliu
 */
public class MBAScreen implements Screen {

    @Override
    public String kind() {
        String msg = "MBA 显示器";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String view() {
        String msg = "分辨率低";
        System.out.println(msg);
        return msg;
    }
}
