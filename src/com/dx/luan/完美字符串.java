import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/5/14.
 */
public class 完美字符串 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        char a[]=bf.readLine().toCharArray();

         int  num=0;
         int  times[]=new int[26];

         for(int i=0;i<a.length;i++){
             if(a[i]>='A'&&a[i]<='Z'){
                 a[i]= (char) (a[i]+32);
             }
             times[a[i]-'a']++;
         }
             int n=26;
            Arrays.sort(times);
        for(int i=25;i>-1;i--){
            num+=times[i]*n;
            n--;
        }
        System.out.println(num);
    }
}
