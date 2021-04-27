package com.satanbakespancakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int MAXRANGE = 100;
        Random rnd  = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(rnd.nextInt(MAXRANGE));
        }
        System.out.println("Random: " + Arrays.toString(list.toArray()));
        Collections.sort(list, new HashComp());
        System.out.println(Arrays.toString(list.toArray()));
    }
}
