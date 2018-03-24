import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/3/13.
 * 堆积木
 *    0
 *   1 2
 *  3 4 5
 * 6 7 8 9
 */
public class mian3_13_02 {
    public static int n;
    public static void main(String[] args) {
        int x[]={0,1,2,3,4,5,6,7,8,9};
        f(x,0);
        System.out.println(n);
    }

    public static void f(int a[],int k){
            if(k==a.length-1){
                prnum(a);
                return;
            }
            for(int i=k;i<a.length;i++){
                {int x=a[i];a[i]=a[k];a[k]=x;}
                f(a,k+1);
                {int x=a[i];a[i]=a[k];a[k]=x;}
            }
    }
    public static void prnum(int a[]){
        if(a[0]>a[1])return;
        if(a[0]>a[2])return;
        if(a[1]>a[3])return;
        if(a[1]>a[4])return;
        if(a[2]>a[4])return;
        if(a[2]>a[5])return;
        if(a[3]>a[6])return;
        if(a[3]>a[7])return;
        if(a[4]>a[7])return;
        if(a[4]>a[8])return;
        if(a[5]>a[8])return;
        if(a[5]>a[9])return;
        n++;
    }

}
