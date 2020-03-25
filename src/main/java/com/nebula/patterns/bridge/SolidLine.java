package com.nebula.patterns.bridge;

/**
 * ConcreteImplementor
 * @author chunyuliu
 */
public class SolidLine implements Line {

    @Override
    public String style() {
        return "实线";
    }
}
