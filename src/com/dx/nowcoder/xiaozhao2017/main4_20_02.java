package com.dx.nowcoder.xiaozhao2017;

/**
 * Created by Administrator on 2018/4/21.
 */
public class main4_20_02 {
    public static void main(String[] args) {
        int sum=0;

        

        for(int i=1;i<50 ;i++){
            sum+=i;
            System.out.print(sum+"  ");
            if(sum%3==0) System.out.println(true);
            else System.out.println();
        }

    }
}
