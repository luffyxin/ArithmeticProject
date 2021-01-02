package com.dx.luan;

// 尼姆堆的模2加(异或)解法
/*
    10
   101
  1100
  1110
--------
  0101
*/
public class NiMuDui
{

    static void f(int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum ^= a[i];
        }
        if(sum==0){
            System.out.println("输了");
            return;
        }

        for(int i=0; i<a.length; i++){
            int x = sum ^ a[i];
            if(x<a[i]) System.out.println(a[i] + " --> " + x);
        }
    }

    public static void main(String[] args){
        int[] a = {2,5,12,14};
        f(a);
    }

}

