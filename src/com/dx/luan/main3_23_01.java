package com.dx.luan;

/**
 * Created by Administrator on 2018/3/23.
 * 固定数目的组合问题
 */
public class main3_23_01 {


    public static void main(String[] args) {
        String str[]={"a","b","c","d"};
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                for(int k=j+1;k<str.length;k++){
                    System.out.println(""+str[i]+str[j]+str[k]);
                }
            }
        }
    }



}
