package com.nebula.patterns.factorymethod;

/**
 * 定义工厂方法所创建对象的接口
 * @author chunyuliu
 */
public interface Player {

    /**
     * 打开播放器
     * @return
     */
    String open();

    /**
     * 播放
     * @return
     */
    String play();

    /**
     * 关闭播放器
     * @return
     */
    String close();
}
