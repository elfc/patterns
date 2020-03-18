package com.nebula.patterns.adapter;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class AdapterTest {

    @Test
    public void targetTest() {
        Target target = new Adapter(new AdapteeImpl());
        System.out.println("targetTest");
        System.out.println(target.Request());
    }
}
