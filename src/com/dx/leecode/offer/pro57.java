package com.dx.leecode.offer;

import java.util.ArrayList;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * <p>
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 */
public class pro57 {

    public static int[][] findContinuousSequence(int target) {
        ArrayList<Integer[]> resList = new ArrayList<>();
        int max = 0;
        int sum = 0;

        ArrayList<Integer> tempList = new ArrayList<>();
        for (int j = 1; j <= target / 2 + 1; j++) {
            for (int i = j; i <= target / 2 + 1; i++) {
                sum = sum + i;
                tempList.add(i);
                if (sum > target) {
                    sum = 0;
                    tempList.clear();
                    break;
                } else if (sum == target) {
                    Integer[] res = new Integer[tempList.size()];
                    if (tempList.size() > max) {
                        max = tempList.size();
                    }
                    resList.add(tempList.toArray(res));
                    break;
                }
            }
        }

        int[][] resArr = new int[resList.size()][];

        for (int i = 0; i < resList.size(); i++) {
            int [] tarr = new int[resList.get(i).length];
            for (int i1 = 0; i1 < resList.get(i).length; i1++) {
                tarr[i1] = resList.get(i)[i1];
            }

                resArr[i] = tarr;

        }

        return resArr;

    }

    public static void main(String[] args) {

        findContinuousSequence(9);

    }
}
