/**
 * Created by Administrator on 2018/3/18.
 */

// "AABBBC" 取3个, 哪些取法？
public class GroupSelect
{
    static void work(int[] x){
        for(int i=0; i<x.length; i++){
            for(int k=0; k<x[i]; k++){
                System.out.print((char)('A'+i));
            }
        }
        System.out.println();
    }
    // data: 不动, 限制条件
    // x: 取法
    // k: 当前考虑的位置
    // goal: 距离目标的剩余名额
    static void f(int[] data, int[] x, int k, int goal){
        if(k==x.length){
            if(goal==0) work(x);
            return;
        }

        for(int i=0; i<=Math.min(data[k],goal); i++){
            x[k] = i;
            f(data, x, k+1, goal-i);
        }
        x[k] = 0; // 回溯
    }

    public static void main(String[] args)
    {
        int[] data = {2,3,1};  // 每个元素的最大个数
        int[] x = new int[data.length];  // 每个元素取几个

        f(data, x, 0, 3);
    }
}
