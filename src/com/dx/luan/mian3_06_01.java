package com.dx.luan;

/**
 * Created by Administrator on 2018/3/6.
 */
public class mian3_06_01
{
    static int[][] transx={{0,1,2,3},{4,21,14,19},{7,20,13,18}};
    static int[][] transy={{4,5,6,7},{1,17,11,21},{2,18,8,22}};
    static int[][] transz={{16,17,18,19},{0,12,8,4},{1,13,9,5}};

    static char[] op(char[] a,int[][] trans){
        char[] b = java.util.Arrays.copyOf(a,a.length);
        for(int i=0; i<trans.length; i++){
            b[trans[i][1]] = a[trans[i][0]];
            b[trans[i][2]] = a[trans[i][1]];
            b[trans[i][3]] = a[trans[i][2]];
            b[trans[i][0]] = a[trans[i][3]];
        }
        return b;
    }
    static char[] op(char[] a, String s){
        char[] b = java.util.Arrays.copyOf(a, a.length);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='x') b = op(b, transx);
            if(s.charAt(i)=='y') b = op(b, transy);
            if(s.charAt(i)=='z') b = op(b, transz);
        }
        return b;
    }
    public static void main(String[] args){
        char[] init =  {'绿','绿','绿','绿',
                '红','红','红','红',
                '蓝','蓝','蓝','蓝',
                '橙','橙','橙','橙',
                '白','白','白','白',
                '黄','黄','黄','黄',};
        //char[] b = op(init, "xyxyzzxyxyzz");
        char[] b = op(init, "x");
        System.out.println(""+b[1]+b[4]+b[18]);
    }
}
