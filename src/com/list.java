package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class list {

    public static void main(String[] args) {
        ArrayList abc=new ArrayList();
        abc.add("abc");
        abc.add(111);
//        System.out.println(abc.get(0));

//        abc.remove(0);//线程的问题

        for(int i=0;i<abc.size();i++){
            System.out.println((int)abc.get(i));
        }

        LinkedList efg=new LinkedList();
        efg.add("111");
        efg.add("111");
        for (Object s:efg) {
            System.out.println(s.toString());
        }
    }



}
