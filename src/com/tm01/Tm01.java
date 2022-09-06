package com.tm01;

/**
 * 判断101-200之间有多少个素数，并输出所有素数
 * 只能被1和自身整除数
 */
public class Tm01 {

    /**
     * 程序执行的入口函数
     * @param args
     */
    public static void main(String[]  args){

        boolean flag=true;//非素数

        for(int i=101;i<=200;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){//判断是否能整除，能整除的话
                    flag=false;
                    break;
                }
            }
            //打印素数
            if(flag==true){
                System.out.println(i+"\t");
            }

            flag=true;//标志复位
        }


    }


    public void add(){

    }


}
