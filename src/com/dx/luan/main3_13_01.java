package com.dx.luan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/3/13.
 * 全排列
 */
public class main3_13_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        char [] str=reader.readLine().toCharArray();
        f(str,0);
    }
    public static void f(char []a,int k){
        if(k==a.length-1){
            System.out.println(String.valueOf(a));
            return;
        }
        for(int i=k;i<a.length;i++){
            {char temp=a[i]; a[i]=a[k];a[k]=temp;}
            f(a,k+1);
            {char temp=a[i];a[i]=a[k];a[k]=temp;}
        }


    }



}
