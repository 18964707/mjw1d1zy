package com;

import java.io.IOException;
import java.util.ArrayList;

public class ThrowsDemo {

    public void test(){


        try {
            //要监控可能会发生异常的代码
            ArrayList arr=null;

            System.out.println("try........");
        }catch (Exception ne){
            //异常处理  1\自己处理掉  2\\ 自已不处理，抛出异常,谁调用我，谁来处理这个异常
 //            System.out.println("出现异常");
            ne.printStackTrace();//在开发过程中
            throw ne;
            //xxxxxx
        }finally {  //不管出不出异常，都会被执行！！！！
            System.out.println("finally.....");
            //释放资源的操作  跟数据库的连接对象，关闭  connection
        }

//
//
//
//
//        throw  new NullPointerException();
    }



    public static void main(String[] args){
        ThrowsDemo td=new ThrowsDemo();
        td.test();
    }



}
