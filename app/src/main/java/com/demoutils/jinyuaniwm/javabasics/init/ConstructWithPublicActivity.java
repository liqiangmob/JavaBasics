package com.demoutils.jinyuaniwm.javabasics.init;

import android.app.Activity;
import android.os.Bundle;

import com.demoutils.jinyuaniwm.javabasics.LogUtils;
import com.demoutils.jinyuaniwm.javabasics.R;

public class ConstructWithPublicActivity extends Activity {


    private String TAG = ConstructWithPublicActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construct_with_public);

        Child child = new Child();
        child.test();
    }


    class Base {
        public Base() {
            test();
        }

        public void test() {
        }


    }

    class Child extends Base {
        int a = 123;

//        @Override
        public void test() {
//            super.test();
            LogUtils.d(TAG, a + "");
        }
    }
}





