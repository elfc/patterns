package com.nebula.patterns.prototype;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class PrototypeTest {

    @Test
    public void screwHardwareTest() {
        PrototypeManager.load();

        // 生产小号螺丝
        Hardware screwSmallSize = PrototypeManager.getHardware("screw");
        screwSmallSize.setSize(1);
        System.out.println(screwSmallSize);

        // 生产中号螺丝
        Hardware screwMiddleSmall = PrototypeManager.getHardware("screw");
        screwMiddleSmall.setSize(2);
        System.out.println(screwMiddleSmall);

        // 生产小号螺母
        Hardware nutSmallSize = PrototypeManager.getHardware("nut");
        nutSmallSize.setSize(1);
        System.out.println(nutSmallSize);
    }
}
