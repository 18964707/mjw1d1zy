package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//毫秒

        Date date =new Date();  //日期
        System.out.println(date);

          //格式化日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=sdf.format(date);
        System.out.println(str);

        //日历，用来做日期的计算
        Calendar c=Calendar.getInstance();
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }


}
