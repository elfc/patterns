package com.nebula.patterns.factorymethod;

/**
 * 声明工厂方法，该方法返回一个Player类型对象
 * @author chunyuliu
 */
public interface Factory {

    /**
     * 工厂方法, 新建播放器
     * @return
     */
    Player createPlayer();
}
