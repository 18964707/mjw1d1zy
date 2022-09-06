package com.tm02;

/**
 * 打印出所有的 "水仙花数 "，
 * 所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。 例如：153是一个 "水仙花数
 * 因为153=1的三次方＋5的三次方＋3的三次方
 */
public class Tm02 {

    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int sum;

        for(int i=100;i<=999;i++){
            n1=i/100;//求百位
            n2=i%100/10;//求十位
            n3=i%10;//求个位
            sum=n1*n1*n1+n2*n2*n2+n3*n3*n3;
            if(sum==i){
                System.out.println(i);
            }

        }
    }
}
