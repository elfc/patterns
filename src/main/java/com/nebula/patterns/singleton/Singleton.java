package com.nebula.patterns.singleton;

/**
 * @author chunyuliu
 */
public class Singleton {

    /**
     * 避免直接使用static final 导致类加载时就创建对象
     * 静态内部类只会被加载一次，解决线程安全问题
     */
    private static class Instance {
        private static Singleton INSTANCE = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return Instance.INSTANCE;
    }
}
