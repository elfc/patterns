package com.nebula.patterns.builder.classic;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class BuilderClassicTest {

    @Test
    public void mbpLaptopTest() {
        LaptopBuilder laptopBuilder = new MBPLaptopBuilder();
        Laptop laptop = new Director(laptopBuilder).getLaptop();
        System.out.println("MBP Laptop: " + laptop);
    }

    @Test
    public void mbaLaptopTest() {
        LaptopBuilder laptopBuilder = new MBALaptopBuilder();
        Laptop laptop = new Director(laptopBuilder).getLaptop();
        System.out.println("MBA Laptop: " + laptop);
    }
}
