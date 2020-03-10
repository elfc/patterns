package com.nebula.patterns.builder.classic;

/**
 * 为创建一个Product对象的哥哥部件指定抽象接口
 * Builder
 *
 * @author chunyuliu
 */
public interface LaptopBuilder {

    void buildModel();

    void buildMonitor();

    void buildCPU();

    void buildMem();

    void buildDisk();

    Laptop getLaptop();
}
