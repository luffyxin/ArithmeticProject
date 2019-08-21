import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/18.
 */
public class maopao {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<people> pList = new ArrayList<people>();

        for (int i = 0; i < n; i++) {
            people p = new people();
            String arr[] = reader.readLine().split(" ");
            p.setName(arr[0]);
            p.setSex(arr[1]);
            p.setAge(Integer.parseInt(arr[2]));
            pList.add(p);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pList.get(j).getAge() < pList.get(j + 1).getAge()) {
                    pList.add(j, pList.get(j + 1));
                    pList.remove(j + 2);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pList.get(i).getName() + " " + pList.get(i).getAge());
        }
    }
}
