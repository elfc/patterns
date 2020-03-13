package com.nebula.patterns.factorymethod;

import com.nebula.patterns.factorymethod.impl.HPModeFactory;
import com.nebula.patterns.factorymethod.impl.NormalModeFactory;
import com.nebula.patterns.factorymethod.impl.ParamFactoryImpl;
import org.junit.jupiter.api.Test;

/**
 * 工厂方法测试
 * @author chunyuliu
 */
public class FactoryMethodOriginTest {

    @Test
    public void normalModeFactoryTest() {
        Player player = new NormalModeFactory().createPlayer();
        System.out.println("normalModeFactoryTest");
        System.out.println(player.open());
        System.out.println(player.play());
        System.out.println(player.close());
    }

    @Test
    public void hpModeFactoryTest() {
        Player player = new HPModeFactory().createPlayer();
        System.out.println("hpModeFactoryTest");
        System.out.println(player.open());
        System.out.println(player.play());
        System.out.println(player.close());
    }

    @Test
    public void paramFactoryTest() {
        Player normalModePlayer = new ParamFactoryImpl().createPlayer("normal");
        System.out.println("param normalModeFactoryTest");
        System.out.println(normalModePlayer.open());
        System.out.println(normalModePlayer.play());
        System.out.println(normalModePlayer.close());

        Player hplModePlayer = new ParamFactoryImpl().createPlayer("hp");
        System.out.println("hp normalModeFactoryTest");
        System.out.println(hplModePlayer.open());
        System.out.println(hplModePlayer.play());
        System.out.println(hplModePlayer.close());
    }
}
