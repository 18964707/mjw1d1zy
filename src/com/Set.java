package com;

import java.util.HashMap;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        HashSet abc= new HashSet();
        abc.add("abc");
        abc.add("efg");
        abc.add(null);
        abc.add("abc");


        for (Object s:abc) {
            System.out.println(s);
        }


    }
}
