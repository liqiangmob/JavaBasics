package com.demoutils.jinyuaniwm.javabasics.init;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.demoutils.jinyuaniwm.javabasics.R;

public class Baseb_cActivity extends Activity {

    String TAG = Baseb_cActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseb_c);

        Baseb_cChild c = new Baseb_cChild();
        Baseb_cBase b = c;

        Log.d(TAG, b.s);
        Log.d(TAG, b.m);
        b.staticTest();
        Log.d(TAG, c.s);
        Log.d(TAG, c.m);
        c.staticTest();
    }


}
