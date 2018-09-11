package com.demoutils.jinyuaniwm.javabasics.Pair;

/**
 * Created by jinyuaniwm on 2018/9/11.
 */

public class SimplePair<U,V> {
    U first;
    V second;

    public SimplePair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public void setFirst(U first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
