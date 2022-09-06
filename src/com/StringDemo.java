package com;

public class StringDemo {

    public static void main(String[] args) {
        String str="abcdefg";

        String a="张";
        String b="三";

        StringBuilder sb=new StringBuilder();
        sb.append(a);
        sb.append(b);

        System.out.println(a+b);
        System.out.println(sb.toString());


    }
}
