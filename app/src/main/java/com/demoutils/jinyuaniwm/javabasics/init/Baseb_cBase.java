package com.demoutils.jinyuaniwm.javabasics.init;

import com.demoutils.jinyuaniwm.javabasics.LogUtils;

/**
 * Created by jinyuaniwm on 2018/9/11.
 */

public class Baseb_cBase {
    public static String s = "static_base";
    public String m = "base";

    public static void staticTest() {
        LogUtils.d(s, "base static: " + s);
    }
}
