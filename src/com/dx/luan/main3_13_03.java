package com.dx.luan;

import java.util.*;

// 递归思路：第1次取什么？
public class main3_13_03
{
    static List f(String s, int n){
        List lst = new Vector();
        if(n==0){
            lst.add("");
            return lst;
        }

        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            List t = f(s.substring(i+1),n-1);
            for(int k=0; k<t.size(); k++){
                lst.add("" + x + t.get(k));
            }
        }

        return lst;
    }

    public static void main(String[] args){
        List lst = f("ABCDE", 3);
        for(int i=0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }
    }
}
