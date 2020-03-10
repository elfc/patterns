package com.nebula.patterns.abstractfactory;

import com.nebula.patterns.abstractfactory.impl.MBAVendorAbstractFactory;
import com.nebula.patterns.abstractfactory.impl.MBPVendorAbstractFactory;
import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class AbstractFactoryTest {

    @Test
    public void mbpVendorTest() {
        // MBP
        VendorAbstractFactory mbpVendor = new MBPVendorAbstractFactory();
        // 显示器
        Screen mbpScreen = mbpVendor.createScreen();
        // 键盘
        Keyboard mbpKeyboard = mbpVendor.createKeyboard();

        mbpScreen.kind();
        mbpScreen.view();

        mbpKeyboard.kind();
        mbpKeyboard.press();
    }

    @Test
    public void mbaVendorTest() {
        // MBA
        VendorAbstractFactory mbaVendor = new MBAVendorAbstractFactory();
        // 显示器
        Screen mbaScreen = mbaVendor.createScreen();
        // 电车
        Keyboard mbaKeyboard = mbaVendor.createKeyboard();

        mbaScreen.kind();
        mbaScreen.view();

        mbaKeyboard.kind();
        mbaKeyboard.press();
    }
}
