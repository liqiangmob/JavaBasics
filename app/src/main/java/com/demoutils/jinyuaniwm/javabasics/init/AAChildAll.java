package com.demoutils.jinyuaniwm.javabasics.init;

/**
 * Created by jinyuaniwm on 2018/9/11.
 */

public class AAChildAll extends AABaseAll {


    public static int s;
    private int a;

    static {
        System.out.println("   Child    , s: " + s);
        s = 10;
    }

    {
        System.out.println("  Child     , a: " + a);
        a = 10;
    }

    public AAChildAll() {
        System.out.println("   Child   , a: " + a);
        a = 20;
    }

    protected void step() {
        System.out.println("  child s: " + s + ", a: " + a);
    }


}
