package com.dx.luan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main2_27_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String creditCard = reader.readLine();
        int ji = 0;
        int ou = 0;
        boolean jishu = true;
        for (int i = creditCard.length() - 1; i >= 0; i--) {
            if (jishu) {
                ji += creditCard.charAt(i) - '0';
                jishu = false;
            } else {
                int temp = creditCard.charAt(i) - '0';
                if (temp == 1) ou += 2;
                if (temp == 2) ou += 4;
                if (temp == 3) ou += 6;
                if (temp == 4) ou += 8;
                if (temp == 5) ou += 1;
                if (temp == 6) ou += 3;
                if (temp == 7) ou += 5;
                if (temp == 8) ou += 7;
                if (temp == 9) ou += 9;
                jishu = true;
            }
        }
        int sum = ji + ou;
        if (sum % 10 == 0) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}