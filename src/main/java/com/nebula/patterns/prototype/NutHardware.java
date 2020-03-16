package com.nebula.patterns.prototype;

import lombok.Data;

/**
 * @author chunyuliu
 */
@Data
public class NutHardware extends Hardware {

    /** 大小 */
    int size;

    /** 模型 */
    String model;

    /** 样式 */
    String style;

    /** 材料 */
    String material;
}
