

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
基础练习 数列排序
 */
public class mian2_26_01 {
    public static void insertionSort(int array[], int N) {
        int temp;
        for (int p = N - 1; p >= 0; p--) {
            for (int i = 0; i < p; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().toString());
        int a[] = new int[n];
        String str[] = reader.readLine().toString().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        insertionSort(a, n);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
