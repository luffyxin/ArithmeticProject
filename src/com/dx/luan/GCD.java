/**
 * Created by Administrator on 2018/3/24.
 *
 * 辗转相除法  最大公约数  最小公倍数
 *最小公倍数是  a*b/最大公约数
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(40,15));
        System.out.println(40*15/gcd(40,15));
    }


    public static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }

}


