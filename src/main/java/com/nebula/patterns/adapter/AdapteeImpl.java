package com.nebula.patterns.adapter;

/**
 * Adaptee
 * @author chunyuliu
 */
public class AdapteeImpl implements Adaptee {

    @Override
    public String SpecificRequest() {
        return "SpecificRequest";
    }
}
