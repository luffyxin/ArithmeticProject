package com.dx.luan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/3/18.
 * 游戏人物标记
 */
public class mian3_18_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = reader.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        if (a <= 1024 && a >= 1 && b <= 1024 && b >= 1) {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(-1);
        }
    }
}
