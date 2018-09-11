package com.demoutils.jinyuaniwm.javabasics;

import android.util.Log;

/**
 * Created by jinyuaniwm on 2018/9/11.
 */

public class LogUtils {

    public static void d(String tag, String msg) {
        Log.d("tag", "---------------------------------------------");
        Log.d(tag, msg);
    }
}
