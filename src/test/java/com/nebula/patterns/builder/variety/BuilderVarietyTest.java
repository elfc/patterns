package com.nebula.patterns.builder.variety;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class BuilderVarietyTest {

    @Test
    public void mbpLaptopTest() {
        LaptopVariety laptopVariety = new LaptopVariety.Builder()
                .model("MBP 笔记本")
                .monitor("15 寸 大分辨率")
                .cpu("I7")
                .mem("32GB")
                .disk("512GB")
                .build();
        System.out.println("MBPLaptopVariety: " + laptopVariety);
    }

    @Test
    public void mbaLaptopTest() {
        LaptopVariety laptopVariety = new LaptopVariety.Builder()
                .model("MBA 笔记本")
                .monitor("13 寸普通屏幕")
                .cpu("I3")
                .mem("8GB")
                .disk("256GB")
                .build();
        System.out.println("MBALaptopVariety: " + laptopVariety);
    }
}
