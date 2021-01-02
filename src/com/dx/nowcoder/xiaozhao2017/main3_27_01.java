package com.dx.nowcoder.xiaozhao2017;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/3/27.
 * 第三便宜的价格
 */
public class main3_27_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        String str[] = reader.readLine().split(" ");

        Set<Integer> num = new TreeSet<Integer>();

        for (int i = 0; i < str.length; i++) {
            num.add(Integer.parseInt(str[i]));
        }

        int x[] = new int[num.size()];
        int time = 0;
        for (Integer m : num) {
            x[time] = m;
            time++;
        }

        Arrays.sort(x);
        if (x.length < 3) {
            System.out.println(-1);
        } else {
            System.out.println(x[2]);
        }
    }
}
