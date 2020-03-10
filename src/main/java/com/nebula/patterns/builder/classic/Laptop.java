package com.nebula.patterns.builder.classic;

import lombok.Data;

/**
 *
 * 最终要需要的商品笔记本电脑对象
 * ConcreteBuilder创建该产品的内部表示并定义它的装配过程
 * 包含定义组成部件的类，包括将这些部件装配程最终产品接口。
 * Product
 *
 * @author chunyuliu
 */
@Data
public class Laptop {

    /** 型号 */
    private String model;

    /** 显示器 */
    private String monitor;

    /** CPU */
    private String CPU;

    /** 内存 */
    private String mem;

    /** 磁盘 */
    private String disk;
}
