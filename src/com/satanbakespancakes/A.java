package com.satanbakespancakes;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.zip.CRC32;

public class A<T> implements Comparable<T> {
    T val;

    public A(T value){
        val = value;
    }


    @Override
    public int compareTo(T o) {
        return val.toString().compareTo(o.toString());
    }
}
