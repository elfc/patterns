package com.nebula.patterns.factorymethod.impl;

import com.nebula.patterns.factorymethod.Factory;
import com.nebula.patterns.factorymethod.Player;

/**
 * 重定义工厂方法以返回一个ConcreteProduct实例
 * @author chunyuliu
 */
public class HPModeFactory implements Factory {

    @Override
    public Player createPlayer() {
        return new HPModePlayer();
    }
}
