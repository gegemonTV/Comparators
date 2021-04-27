package com.satanbakespancakes;

import java.util.Comparator;
import java.util.List;

public class B<T> implements Comparable<List<T>> {

    List<T> val;

    public B(List<T> value){
        val = value;
    }

    @Override
    public int compareTo(List<T> o) {
        String a = "", b = "";
        for (T i: o){
            a+=i.toString();
        }
        for (T i: val){
            b+=i.toString();
        }
        return a.compareTo(b);
    }
}
