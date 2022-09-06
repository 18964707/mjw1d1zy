package com.tm05;

public class PassObject {

    public void printArea(Circle c,int time){

        for(int i=1;i<=time;i++){
            c.radius=i;
            double area=c.findArea();
            System.out.println(i+"\t\t\t"+area);
        }

    }

    public static void main(String[] args) {
        PassObject object=new PassObject();
        object.printArea(new Circle(),5);
    }
}
