
public class main3_23_02
{
    //a：可取最大个数的限定
    //k: 当前考虑位置
    //n: 目标名额
    //s: 已经决定的代表团成员
    public static void f(int[] a, int k, int n, String s)
    {
        if(k==a.length){
           if(n==0) System.out.println(s);
            return;
        }
        String s2=s;
        for(int i=0;i<a.length;i++){
            f(a,k+1,n-1,s2);
            s2+=(char)(k+'A');
        }
    }

    public static void main(String[] args)
    {
        int[] a = {2,3,1};

        f(a,0,3,"");
    }
}