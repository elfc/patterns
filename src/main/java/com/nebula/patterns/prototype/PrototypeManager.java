package com.nebula.patterns.prototype;

import java.util.Hashtable;

/**
 * @author chunyuliu
 */
public class PrototypeManager {

    private static Hashtable<String, Hardware> hardwareMap
            = new Hashtable<String, Hardware>();

    public static Hardware getHardware(String hardwareId) {
        return  hardwareMap.get(hardwareId).clone();
    }

    /**
     * 加载不同类型的原型
     */
    public static void load() {
        Hardware screw = new ScrewHardware();
        screw.setModel("螺丝模型");
        screw.setStyle("花纹");
        screw.setMaterial("不锈钢");
        hardwareMap.put("screw", screw);

        Hardware nut = new NutHardware();
        nut.setModel("螺母模型");
        nut.setStyle("花纹");
        nut.setMaterial("不锈钢");
        hardwareMap.put("nut", nut);
    }
}
