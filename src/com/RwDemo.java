package com;

import java.io.*;

public class RwDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("d:/a.txt");
        FileWriter fw=new FileWriter("d:/b.txt");

        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);

        try {
            String str="";
            while ((str=br.readLine())!=null){
                bw.write(str+"\n");
            }



//            char c[]=new char[1024];
////            int n=0;//实际读到的字符数
////            while(   (n=fr.read(c))!=-1  ){
////                fw.write(c,0,n);
////            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bw.close();
            br.close();
            fr.close();
            fw.close();
        }


    }


}
