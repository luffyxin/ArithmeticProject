import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/30.
 */
public class dengixn {
    public static void main(String[] args) {
        System.out.println("要输入的产品类目数量：");
        Scanner scan = new Scanner(System.in);
        int chanping = scan.nextInt();

        Map<String, HashMap> leimu = new HashMap<String, HashMap>();

        for (int i = 0; i < chanping; i++) {
            System.out.println("请输入第" + i + "个产品名称");
            String name = scan.next();
            HashMap<Integer, ArrayList> chan = new HashMap();
            leimu.put(name, chan);
        }
        String name2 = "";
        int pn = 0;
        for (int i = 0; i < leimu.size(); i++) {
            System.out.println("请输入名字");
            name2 = scan.next();
            System.out.println("请输入数量：");
            int shuliang = scan.nextInt();

            System.out.println("请输入配比：");
            String peibi = scan.next();
            int peibishulie[] = new int[peibi.length()];

            pn = peibishulie.length;

            char chuan[] = peibi.toCharArray();


            for (int y = 0; y < peibi.length(); y++) {
                peibishulie[y] = peibishulie[y] - 48;
            }



        }

        System.out.println("xxxxxx:");
        String name3 = scan.next();


    }
}


