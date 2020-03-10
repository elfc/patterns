package com.nebula.patterns.builder.classic;

/**
 * 构造一个使用Builder接口的对象
 * Director
 *
 * @author chunyuliu
 */
public class Director {

    private LaptopBuilder laptopBuilder;

    public Director(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
        laptopBuilder.buildModel();
        laptopBuilder.buildMonitor();
        laptopBuilder.buildCPU();
        laptopBuilder.buildMem();
        laptopBuilder.buildDisk();
    }

    public Laptop getLaptop() {
        return laptopBuilder.getLaptop();
    }
}
