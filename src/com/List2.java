package com;

import java.util.ArrayList;

public class List2 {

    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("abc");
        a.add("ee");
//        a.add(123);

        for (int i=0;i<a.size();i++) {
            String str=a.get(i);
            System.out.println(str);
        }
    }
}
