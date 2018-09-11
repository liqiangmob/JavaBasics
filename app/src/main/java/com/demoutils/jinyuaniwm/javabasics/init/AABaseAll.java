package com.demoutils.jinyuaniwm.javabasics.init;

/**
 * Created by jinyuaniwm on 2018/9/11.
 */

public class AABaseAll {


    public static int s;
    private int a;

    static {
        System.out.println("   base    , s: " + s);
        s = 1;
    }

    {
        System.out.println("   base    , a: " + a);
        a = 1;
    }

    public AABaseAll() {
        System.out.println("   base   , a: " + a);
        a = 2;
    }

    protected void step() {
        System.out.println("   base s: " + s + ", a: " + a);
    }

    public void action() {
        System.out.println("base start");
        step();
        System.out.println("base end");
    }

}
