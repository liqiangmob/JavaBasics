package com.demoutils.jinyuaniwm.javabasics.init;

import android.app.Activity;
import android.os.Bundle;

import com.demoutils.jinyuaniwm.javabasics.R;

public class AABaseAllActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_all);

        System.out.println("---- new Child()");
        AAChildAll c = new AAChildAll();
        System.out.println("\n---- c.action()");
        c.action();
        AABaseAll b = c;
        System.out.println("\n---- b.action()");
        b.action();
        System.out.println("\n---- b.s: " + b.s);
        System.out.println("\n---- c.s: " + c.s);
    }
}
