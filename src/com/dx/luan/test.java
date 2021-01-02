package com.dx.luan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/5/1.
 */
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("依次输入名字:");
        String arr[] = bufferedReader.readLine().split(" ");

        int[][] biao = new int[14][arr.length];
        int sum5=0;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < arr.length; j++) {
                biao[i][j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入" + arr[i] + "的数量和配比：");
            int num = Integer.parseInt(bufferedReader.readLine());
            arr[i]+=num;
            sum5+=num;
            String arry[] = bufferedReader.readLine().split(" ");
            int pei[] = new int[arry.length];
            for (int j = 0; j < arry.length; j++) {
                pei[j] = Integer.parseInt(arry[j]);
            }


            for (int j = 0; j < pei.length; j++) {
                if (j == 0) {
                    biao[pei[0] - 1][i] = num;
                }
                if (j == 1) {
                    biao[pei[1] + 2][i] = num;
                }
                if (j == 2) {
                    biao[pei[2] + 5][i] = num;
                }
                if (j == 3) {
                    biao[pei[3] + 9][i] = num;
                }
                if (j == 4) {
                    biao[pei[4] + 9][i] = num;
                }
                if (j == 5) {
                    biao[pei[5] + 9][i] = num;
                }
                if (j == 6) {
                    biao[pei[6] + 9][i] = num;
                }
            }
        }
        int sum[]=new int[14];
        for(int i=0;i<14;i++){
            for(int j=0;j<arr.length;j++){
                sum[i]+=biao[i][j];
            }
        }

        for (int x = 0; x < arr.length; x++) {
            System.out.print("   " + arr[x] + "      ");
        }
        System.out.print("合计："+sum5);
        System.out.println();
        String arr2[] = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3", "C4", "D1", "D2", "D3", "D4"};
        for (int i = 0; i < 14; i++) {
            System.out.print(arr2[i] + "   ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(biao[i][j] + "       ");
            }
            System.out.println(arr2[i]+" 合计："+sum[i]);
        }


    }
}
