/**
 * Created by Administrator on 2018/3/27.
 * 高僧斗法
 */
public class GaoSengDouFa {
    public static void main(String[] args) {
            solve(new int[]{1,5,9});
    }
    public static void solve(int x[]){
        for(int i=0;i<x.length-1;i++){
            for(int k=x[i]+1;k<x[i+1];k++){
                int old=x[i];
                try{

                    x[i]=k;
                    if(f(x)==false){
                        System.out.println(old+"  "+k);
                        return;
                    }

                }
                finally {
                    x[i]=old;
                }
            }
        }
    }
    public static boolean f(int x[]){
        int sum=0;
        for(int i=0;i<x.length-1;i+=2){
            sum ^=x[i+1]-x[i]-1;
            if(sum==0)return false;
        }
        return true;
    }


}
