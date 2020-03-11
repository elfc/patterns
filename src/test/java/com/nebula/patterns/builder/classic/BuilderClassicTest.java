package com.nebula.patterns.builder.classic;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class BuilderClassicTest {

    @Test
    public void highLaptopTest() {
        LaptopBuilder laptopBuilder = new HighLaptopBuilder();
        Laptop laptop = new Supplier(laptopBuilder).getLaptop();
        System.out.println("高配 Laptop: " + laptop);
    }

    @Test
    public void lowLaptopTest() {
        LaptopBuilder laptopBuilder = new LowLaptopBuilder();
        Laptop laptop = new Supplier(laptopBuilder).getLaptop();
        System.out.println("低配 Laptop: " + laptop);
    }
}
