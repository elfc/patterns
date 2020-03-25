package com.nebula.patterns.bridge;

/**
 * ConcreteImplementor
 * @author chunyuliu
 */
public class DottedLine implements Line {

    @Override
    public String style() {
        return "虚线";
    }
}
