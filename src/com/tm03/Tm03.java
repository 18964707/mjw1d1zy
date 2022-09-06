package com.tm03;

import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天
 *
 * 9.6   1-8   6
 */
public class Tm03 {

    public static void main(String[] args) {
       int year;
       int month;
       int day;
       int total=0;
       int[] arr={31,28,31,30,31,3,31,31,30,31,30,31};
        //输入
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年：");
        year=scanner.nextInt();
        System.out.println("请输入月：");
        month=scanner.nextInt();
        System.out.println("请输入日：");
        day=scanner.nextInt();

        //判断输入的年是否润年
        if((year %4==0 && year%100!=0) || (year%400==0)){//润年
            arr[1]=29;
        }

        for(int i=0;i<month-1;i++){//累加月份的天数
            total+=arr[i];
        }

        //加上当天日数
        total+=day;
        System.out.println(total);
    }
}
