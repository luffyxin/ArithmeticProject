import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/3/24.
 * A A 2 2 3 3 4 4， 一共4对扑克牌。请你把它们排成一行。
 要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。

 请填写出所有符合要求的排列中，字典序最小的那个。
 例如：22AA3344 比 A2A23 344 字典序小。当然，它们都不是满足要求的答案。


 ps:全排筛选
 */
public class poker {
    static Set set=new TreeSet();
    public static void main(String[] args) {
            char a[]="AA223344".toCharArray();
            arrange(a,0);
            for(Object o:set) System.out.println(o);
    }

    public static void arrange(char str[],int k){
        if(k==str.length){
            f(str);
            return;
        }
        for(int i=k;i<str.length;i++){
            {char x=str[k];str[k]=str[i];str[i]=x;}
            arrange(str,k+1);
            {char x=str[k];str[k]=str[i];str[i]=x;}
        }
    }
    public static void f(char m[]){
        String str=new String (m);
        if(str.lastIndexOf('A')-str.indexOf('A')!=2)return;
        if(str.lastIndexOf('2')-str.indexOf('2')!=3)return;
        if(str.lastIndexOf('3')-str.indexOf('3')!=4)return;
        if(str.lastIndexOf('4')-str.indexOf('4')!=5)return;
        set.add(str);

    }


}

