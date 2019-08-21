import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/3/23.
 */
public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int sum = Integer.parseInt(reader.readLine());
        for (int i = 1; i < 100; i++) {
            System.out.println(i + "=" + f(i));
        }

        //天平称重 暴力
        /**
         String str[] = {"-", "+", "*"};
         int fuhao[] = {-1, 1, 0};
         int time = 0;
         for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
         for (int k = 0; k < 3; k++) {
         for (int x = 0; x < 3; x++) {
         for (int y = 0; y < 3; y++) {
         int num[] = new int[5];
         num[0] = 81 * fuhao[i];
         num[1] = 27 * fuhao[j];
         num[2] = 9 * fuhao[k];
         num[3] = 3 * fuhao[x];
         num[4] = fuhao[y];
         String str1[] = {str[i], str[j], str[k], str[x], str[y]};
         if (sum == 81 * fuhao[i] + 27 * fuhao[j] + 9 * fuhao[k] + 3 * fuhao[x] + fuhao[y]) {
         for (int e = 0; e < 5; e++) {
         if (num[e] > 0 && time != 0) {
         System.out.print(str1[e] + num[e]);
         } else if (num[e] != 0) {
         System.out.print(num[e]);
         time++;
         }
         }
         }
         }
         }
         }
         }
         }
         **/

    }

    //递归解法
    public static String f(int x) {
        int a = 1;
        while (a < x) a *= 3;

        if (a == x) return a + "";
        if (x <= a / 2) return a / 3 + "+" + f(x - a / 3);
        return a + reve(f(a - x));

    }

    public static String reve(String str) {
        str.replace("-", "#");
        str.replace("+", "-");
        str.replace("#", "+");
        return "-" + str;
    }



}
