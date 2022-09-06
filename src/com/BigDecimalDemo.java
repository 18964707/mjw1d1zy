package com;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {
        double a=0.3;
        double b=3;
        System.out.println(a*b);

        BigDecimal b1=new BigDecimal(a);
        BigDecimal b2=new BigDecimal(b);
//        System.out.println(b1.multiply());
    }
}
