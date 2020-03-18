package com.nebula.patterns.adapter;

/**
 * Adapter
 * @author chunyuliu
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String Request() {
        return adaptee.SpecificRequest();
    }
}
