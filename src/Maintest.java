import java.util.ArrayList;

public class Maintest {
    private static ArrayList <Integer>tmpArr = new ArrayList<>();
    public static void main(String[] args) {
        int [] com = {1,1,2};
        int k = 3;
        if(k > com.length || com.length <= 0){
            return ;
        }
        combine(0,2,com);
    }
    public static void combine(int index,int k,int []arr) {
        if(k == 1){
            for (int i = index; i < arr.length; i++) {
                tmpArr.add(arr[i]);
                System.out.println(tmpArr.toString());
                tmpArr.remove((Object)arr[i]);
            }
        }else if(k > 1){
            for (int i = index; i <= arr.length - k; i++) {
                tmpArr.add(arr[i]);
                combine(i + 1,k - 1, arr);
                tmpArr.remove((Object)arr[i]);
            }
        }else{
            return ;
        }
    }
} 