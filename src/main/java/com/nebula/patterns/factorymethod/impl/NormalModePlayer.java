package com.nebula.patterns.factorymethod.impl;

import com.nebula.patterns.factorymethod.Player;

/**
 * 实现Product接口
 * 正常模式播放器
 * @author chunyuliu
 */
public class NormalModePlayer implements Player {

    @Override
    public String open() {
        return "正常模式打开播放器";
    }

    @Override
    public String play() {
        return "正常模式播放";
    }

    @Override
    public String close() {
        return "正常模式关闭播放器";
    }
}
