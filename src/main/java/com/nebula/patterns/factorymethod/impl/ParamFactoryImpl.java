package com.nebula.patterns.factorymethod.impl;

import com.nebula.patterns.factorymethod.ParamFactory;
import com.nebula.patterns.factorymethod.Player;

/**
 * @author chunyuliu
 */
public class ParamFactoryImpl implements ParamFactory {

    @Override
    public Player createPlayer(String productId) {
        if ("normal".equals(productId)) {
            return new NormalModePlayer();
        } else if ("hp".equals(productId)) {
            return new HPModePlayer();
        }

        return null;
    }
}
