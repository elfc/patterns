package com.nebula.patterns.builder.variety;

import lombok.Data;

/**
 * @author chunyuliu
 */
@Data
public class LaptopVariety {

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

    public LaptopVariety(Builder builder) {
        this.model = builder.model;
        this.monitor = builder.monitor;
        this.CPU = builder.CPU;
        this.mem = builder.mem;
        this.disk = builder.disk;
    }

    public static class Builder {

        private String model;
        private String monitor;
        private String CPU;
        private String mem;
        private String disk;

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder monitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder cpu(String cpu) {
            this.CPU = cpu;
            return this;
        }

        public Builder mem(String mem) {
            this.mem = mem;
            return this;
        }

        public Builder disk(String disk) {
            this.disk = disk;
            return this;
        }

        public LaptopVariety build() {
            return new LaptopVariety(this);
        }
    }
}
