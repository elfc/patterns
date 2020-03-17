package com.nebula.patterns.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class SingletonTest {

    @Test
    public void singletonInstanceTest() {
        System.out.println("Instance 1: " + Singleton.getInstance());
        System.out.println("Instance 2: " + Singleton.getInstance());
    }
}
