package com.nebula.patterns.prototype;

import lombok.Data;

/**
 * @author chunyuliu
 */
@Data
public abstract class Hardware implements Cloneable {

    /** 大小 */
    int size;

    /** 模型 */
    String model;

    /** 样式 */
    String style;

    /** 材料 */
    String material;

    @Override
    public Hardware clone() {
        Hardware clone = null;
        try {
            clone = (Hardware) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
