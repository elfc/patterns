package com.nebula.patterns.builder.classic;

/**
 * 实现Builder接口构造和装配该产品各个部件
 * 定义并明确它所创建的表示
 * ConcreteBuilder
 *
 * @author chunyuliu
 */
public class HighLaptopBuilder implements LaptopBuilder {

    private Laptop laptop;

    public HighLaptopBuilder() {
        this.laptop = new Laptop();
    }

    @Override
    public void buildModel() {
        laptop.setModel("我是高配电脑");
    }

    @Override
    public void buildMonitor() {
        laptop.setMonitor("Retina 显示屏");
    }

    @Override
    public void buildCPU() {
        laptop.setCPU("I9");
    }

    @Override
    public void buildMem() {
        laptop.setMem("128GB");
    }

    @Override
    public void buildDisk() {
        laptop.setDisk("2T");
    }

    @Override
    public Laptop getLaptop() {
        return laptop;
    }
}
