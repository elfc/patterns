package com.nebula.patterns.abstractfactory;

import com.nebula.patterns.abstractfactory.impl.MarsThemeFactory;
import com.nebula.patterns.abstractfactory.impl.PlanetThemeFactory;
import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class AbstractFactoryTest {

    @Test
    public void planetFactoryTest() {
        // 地球主题工厂
        ThemeFactory themeFactory = new PlanetThemeFactory();
        // 按钮
        Button button = themeFactory.createButton();
        button.style();
        button.click();

        // 菜单
        Menu menu = themeFactory.createMenu();
        menu.style();
        menu.layout();
    }

    @Test
    public void marsFactoryTest() {
        // 火星主题工厂
        ThemeFactory themeFactory = new MarsThemeFactory();
        // 按钮
        Button button = themeFactory.createButton();
        button.style();
        button.click();

        // 菜单
        Menu menu = themeFactory.createMenu();
        menu.style();
        menu.layout();
    }
}
