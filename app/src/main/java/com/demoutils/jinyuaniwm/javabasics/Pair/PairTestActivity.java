package com.demoutils.jinyuaniwm.javabasics.Pair;

import android.app.Activity;
import android.os.Bundle;

import com.demoutils.jinyuaniwm.javabasics.R;

public class PairTestActivity extends Activity implements InterfacePair<String> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pair_test);

        compareTo("ss");

        NumberPair<Integer,Integer> numberPair=new NumberPair<>(12,22);
    }

    @Override
    public int compareTo(String s) {
        return 0;
    }

    class NumberPair<U extends Integer,V extends Integer> extends SimplePair {

        public NumberPair(U first, V second) {
            super(first, second);
        }
    }
}
