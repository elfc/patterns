package com.nebula.patterns.builder.classic;

/**
 * 实现Builder接口构造和装配该产品各个部件
 * 定义并明确它所创建的表示
 * ConcreteBuilder
 *
 * @author chunyuliu
 */
public class MBALaptopBuilder implements LaptopBuilder {

    private Laptop laptop;

    public MBALaptopBuilder() {
        this.laptop = new Laptop();
    }

    @Override
    public void buildModel() {
        laptop.setModel("MBA 13寸");
    }

    @Override
    public void buildMonitor() {
        laptop.setMonitor("普通显示屏");
    }

    @Override
    public void buildCPU() {
        laptop.setCPU("I3");
    }

    @Override
    public void buildMem() {
        laptop.setMem("8GB");
    }

    @Override
    public void buildDisk() {
        laptop.setDisk("256GB");
    }

    @Override
    public Laptop getLaptop() {
        return laptop;
    }
}
