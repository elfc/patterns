package com.nebula.patterns.builder.classic;

/**
 * 实现Builder接口构造和装配该产品各个部件
 * 定义并明确它所创建的表示
 * ConcreteBuilder
 *
 * @author chunyuliu
 */
public class MBPLaptopBuilder implements LaptopBuilder {

    private Laptop laptop;

    public MBPLaptopBuilder() {
        this.laptop = new Laptop();
    }

    @Override
    public void buildModel() {
        laptop.setModel("MBP 13寸");
    }

    @Override
    public void buildMonitor() {
        laptop.setMonitor("Retina 显示屏");
    }

    @Override
    public void buildCPU() {
        laptop.setCPU("I5");
    }

    @Override
    public void buildMem() {
        laptop.setMem("16GB");
    }

    @Override
    public void buildDisk() {
        laptop.setDisk("512GB");
    }

    @Override
    public Laptop getLaptop() {
        return laptop;
    }
}
