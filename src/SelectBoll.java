/**
 * Created by Administrator on 2018/3/26.
 */
public class SelectBoll {
    public static void main(String[] args) {

        for(int i=0;i<50;i++){
            System.out.println(boll(i));
        }

    }
    public static boolean boll(int x){
        if(x==0)return true;

        if(x>=1 && boll(x-1)==false) return true;
        if(x>=3 && boll(x-3)==false) return true;
        if(x>=8 && boll(x-8)==false) return true;

        return false;

    }
}
