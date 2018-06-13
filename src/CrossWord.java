import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/26.
 */
public class CrossWord {
    static   Map<String,Integer> map=new HashMap<String,Integer>();
    public static void main(String[] args) {
        System.out.println(lol("L**L****LLL***L".toCharArray()));
    }

    public static int lol(char str[]) {
        String s = new String(str);

        if(map.get(s)!=null)return map.get(s);

        if (s.contains("LOL")) {
            map.put(s,-1);
            return -1;
        }
        if (s.contains("*") == false) {
            map.put(s,0);
            return 0;
        }
        boolean ping = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '*') {
                try {
                    str[i] = 'L';
                    {
                        int t = lol(str);
                        if (t < 0) {
                            map.put(s,1);
                            return 1;

                        }
                        if(t==0){
                            map.put(s,0);
                            ping=true;}
                    }
                    str[i] = 'O';
                    {
                        int t = lol(str);
                        if (t < 0) {
                            map.put(s,1);
                            return 1;

                        }
                        if(t==0){
                            map.put(s,0);
                            ping=true;}
                    }
                } finally {
                    str[i] = '*';
                }
            }
        }
        if(ping){
            map.put(s,0);
            return 0;}

        map.put(s,-1);
        return -1;
    }
}
