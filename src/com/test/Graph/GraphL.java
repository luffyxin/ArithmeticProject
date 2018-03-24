package com.test.Graph;

/**
 * Created by Administrator on 2018/3/21.
 * 邻接表
 */
public class GraphL {
    VertexNode[] adjList; //保存邻接表的头节点
    int e;          //图的边数
    int v;          //图的顶点数
    boolean[]       visit;
    public GraphL(int v,int e){
        this.v=v;
        this.e=e;
        adjList=new VertexNode[e+1];
        visit=new boolean[e+1];
        for(int i=0;i<e;i++){
            visit[i]=false;
        }
    }
}
 class EdgeNode{
    int index;
    int value;
    EdgeNode nextArc;
}
class VertexNode{
    String name;
    EdgeNode firstArc=new EdgeNode();
}
//深度优先搜索
class    DFSGraph{
    public  static void DFS(GraphL G,int k){
        System.out.println(G.adjList[k].name);
        G.visit[k]=true;
        EdgeNode p=new EdgeNode();
        p=G.adjList[k].firstArc;
        while (p!=null){
            if(G.visit[p.index]!=true){
                DFS(G,p.index);
            }
            p=p.nextArc;
        }
    }
}



