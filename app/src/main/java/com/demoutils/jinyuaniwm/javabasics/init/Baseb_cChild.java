package com.demoutils.jinyuaniwm.javabasics.init;

import com.demoutils.jinyuaniwm.javabasics.LogUtils;

/**
 * Created by jinyuaniwm on 2018/9/11.
 */

public class Baseb_cChild extends Baseb_cBase {

    public static String s = "child_base";
    public String m = "child";

    public static void staticTest() {
        LogUtils.d(s, "child static: " + s);
    }
}
