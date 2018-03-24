package com.nowcoder.xiaozhao2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/3/19.
 */
// TODO: 2018/3/19  牛客网2018第二题
public class mian3_19_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String nm[]=reader.readLine().split(" ");
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);

        int num[][]=new int [m][3];
        int sum=0;
        for(int i=0;i<m;i++){
            String str[]=reader.readLine().split(" ");
            num[i][0]=Integer.parseInt(str[0]);
            if(num[i][0]>sum)sum=num[i][0];
            num[i][1]=Integer.parseInt(str[1]);
            if(num[i][1]>sum)sum=num[i][1];
            num[i][2]=Integer.parseInt(str[2]);
            if(num[i][2]>sum)sum=num[i][2];
        }
        System.out.println(sum);


    }
}
