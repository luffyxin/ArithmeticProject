package com.dx.dataStructrue.Graph;

/**
 * Created by Administrator on 2018/3/19.
 * 图的矩阵表示,无向图，有向图可用权值代替loolean值
 */
public class GraphM {
    private boolean adjMatrix[][];
    private int vertexCount;
    public GraphM(int vertexCount){
        this.vertexCount=vertexCount;
        adjMatrix=new boolean[vertexCount][vertexCount];
    }
    public void addEdge(int i,int j) {
        if(i>=0&&i<vertexCount&&j>0&&j<vertexCount){
            adjMatrix[i][j]=true;
            adjMatrix[j][i]=true;
        }
    }
    public void removeEdge(int i,int j){
        if(i>=0&&i<vertexCount&&j>0&&j<vertexCount){
            adjMatrix[i][j]=false;
            adjMatrix[j][i]=false;
        }
    }
    public boolean isEdge(int i,int j){
        if(i>=0&&i<vertexCount&&j>0&&j<vertexCount){
            return adjMatrix[i][j];
        }
        else return false;
    }
}
