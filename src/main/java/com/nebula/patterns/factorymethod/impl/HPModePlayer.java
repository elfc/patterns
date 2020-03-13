package com.nebula.patterns.factorymethod.impl;

import com.nebula.patterns.factorymethod.Player;

/**
 * 实现Product接口
 * @author chunyuliu
 */
public class HPModePlayer implements Player {

    @Override
    public String open() {
        return "高性能模式打开播放器";
    }

    @Override
    public String play() {
        return "高性能模式播放";
    }

    @Override
    public String close() {
        return "高性能模式关闭播放器";
    }
}
