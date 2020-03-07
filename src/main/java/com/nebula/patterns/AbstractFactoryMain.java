package com.nebula.patterns;

import com.nebula.patterns.abstractfactory.VendorAbstractFactory;
import com.nebula.patterns.abstractfactory.Keyboard;
import com.nebula.patterns.abstractfactory.Screen;
import com.nebula.patterns.abstractfactory.impl.MBAVendorAbstractFactory;
import com.nebula.patterns.abstractfactory.impl.MBPVendorAbstractFactory;

/**
 * @author chunyuliu
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {

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
