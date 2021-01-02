package com.dx.nowcoder.xiaozhao2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/27.
 * 
 */
// TODO: 2018/3/27  牛客网2017 
public class mian3_27_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());

        String str[]=reader.readLine().split(" ");

        int num[]=new int [str.length];
        for(int i=0;i<str.length;i++){
            num[i]=Integer.parseInt(str[i]);
        }

        int xiong=num[0];
        int jia=num[n-1];

        Arrays.sort(num);
        int sum=0;
        if(Math.abs(num[0]-xiong)>Math.abs(num[n-1])-xiong){

            if(num[num.length-1]>jia)
            sum=(xiong-num[1])*2+num[num.length-1]-xiong+num[num.length-1]-jia;
            else {
                sum=(xiong-num[1])*2+jia-xiong;
            }
        }
        else {
            
        }



    }
}
