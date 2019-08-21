import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/8.
 * 蚂蚁感冒
 */
public class mian3_08_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] num = new int[n];
        String str[] = reader.readLine().split(" ");
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) num[i] = Integer.parseInt(str[i]);
        int x = num[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (Math.abs(num[j]) > Math.abs(num[j + 1])) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        int xiabiao = 0;
        for (int i = 0; i < n; i++) {
            if (x == num[i]) {
                xiabiao = i;
            }
        }
        sum = 1;
        if (x > 0) {
            for (int i = xiabiao+1; i < n; i++) {
                if (num[i] < 0) {
                    sum++;
                }
            }
            if (sum != 1) {
                for (int i = 0; i < xiabiao; i++) {
                    if (num[i] > 0) sum++;
                }
            }
        } else {
            for (int i = 0; i < xiabiao; i++) {
                if (num[i] > 0) sum++;
            }
            if (sum != 1) {
                for (int i = xiabiao+1; i < n; i++) {
                    if (num[i] < 0) sum++;
                }
            }
        }
        System.out.println(sum);

    }

}
