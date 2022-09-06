package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Map {

    public static void main(String[] args) {
        HashMap abc=new HashMap();
        abc.put("a","123");
        abc.put("b","456");

//        System.out.println(abc.get("a"));

        Collection vs=  abc.values();
        Iterator it=vs.iterator();
        while (it.hasNext()){
            String str= (String) it.next();
            System.out.println(str);
        }



        HashSet<String>  a=new HashSet<String>();
        a= (HashSet<String>) abc.keySet();
        Iterator it2=a.iterator();
        while (it2.hasNext()){
            String str= (String) it2.next();
            System.out.println(str);
        }


    }
}
