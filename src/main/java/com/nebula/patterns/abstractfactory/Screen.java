package com.nebula.patterns.abstractfactory;

/**
 * 显示器对象接口
 * AbstractProductA
 * @author chunyuliu
 */
public interface Screen {

    /**
     * 类别
     * @return
     */
    String kind();

    /**
     * 显示
     * @return
     */
    String view();
}
