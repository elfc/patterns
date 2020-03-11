package com.nebula.patterns.builder.classic;

/**
 * 构造一个使用Builder接口的对象
 * Director
 *
 * @author chunyuliu
 */
public class Supplier {

    private LaptopBuilder laptopBuilder;

    public Supplier(LaptopBuilder laptopBuilder) {
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
