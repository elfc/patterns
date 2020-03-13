package com.nebula.patterns.factorymethod;

/**
 * 声明工厂方法，该方法返回一个Product类型对象
 * 提供参数化工厂
 * @author chunyuliu
 */
public interface ParamFactory {

    /**
     * 工厂方法, 新建Player
     * @return
     */
    Player createPlayer(String productId);
}
