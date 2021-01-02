package com.dx.dataStructrue.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2018/3/21.
 */
public class CreateGraph {
    private static GraphL G;

    public static GraphL getG() {
        return G;
    }

    private static int Index(String e1) {
        for (int i = 0; i < G.v; i++) {
            if (G.adjList[i].name.equals(e1)) {
                return i;
            }
        }
        return -1;
    }

    public static void createGraph() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入顶点数v和边数e");
        String ve[] = reader.readLine().split(" ");
        int v = Integer.parseInt(ve[0]);
        int e = Integer.parseInt(ve[1]);
        G = new GraphL(v, e);
        System.out.println("请输入各项顶点信息");
        String ver[] = reader.readLine().split(" ");
        for (int i = 0; i < G.v; i++) {
            G.adjList[i] = new VertexNode();
            G.adjList[i].name = ver[i];
            G.adjList[i].firstArc = null;
        }
        System.out.println("请输入各边信息");
        for (int i = 0; i < G.e; i++) {
            EdgeNode en1 = new EdgeNode();
            //保证e1，e2都是合法输入
            String v1v2[] = reader.readLine().split(" ");

            int v1 = Index(v1v2[0]);
            int v2 = Index(v1v2[1]);
            en1.index = v1;
            en1.nextArc = G.adjList[v2].firstArc;
            G.adjList[v2].firstArc = en1;

            EdgeNode en2 = new EdgeNode();
            en2.index = v2;
            en2.nextArc = G.adjList[v1].firstArc;
            G.adjList[v1].firstArc = en2;
        }
    }
    public static void outputGraph(){
        try{
            System.out.println("输出邻接表存储情况: ");
            EdgeNode en=new EdgeNode();
            for(int i=0;i<G.e;i++){
                System.out.println(G.adjList[i].name);
                en=G.adjList[i].firstArc;
                while(en!=null){
                    System.out.println("->"+G.adjList[en.index].name);
                    en=en.nextArc;
                }
                System.out.println();
            }
        }
        catch (NullPointerException e){

        }
    }
}
