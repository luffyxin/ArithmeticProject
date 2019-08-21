package com.nowcoder.xiaozhao2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/3/19.
 * [编程题] 密码翻译

 时间限制：1秒

 空间限制：65536K
 在情报传递过程中，为了防止情报被截获，往往需要对情报用一定的方式加密，简单的加密算法虽然不足以完全避免情报被破译，
 但仍然能防止情报被轻易的识别。我们给出一种最简的的加密方法，对给定的一个字符串，把其中从a-y,A-Y的字母用其后继字母替代，
 把z和Z用a和A替代，则可得到一个简单的加密字符串。
 */
public class main3_19_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String strold = str;

        for (char i = 'y'; i >= 'a'; i--)
            str = str.replace(i, (char) (i + 1));
        for (char i = 'Y'; i >= 'A'; i--)
            str = str.replace(i, (char) (i + 1));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == strold.charAt(i)) {
                if (str.charAt(i) == 'z')
                    str = str.substring(0, i) + "a" + str.substring(i + 1);
                if (str.charAt(i) == 'Z')
                    str = str.substring(0, i) + "A" + str.substring(i + 1);
            }
        }


        System.out.println(str);

    }
}
