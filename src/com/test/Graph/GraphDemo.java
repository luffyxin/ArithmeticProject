package com.test.Graph;

import java.io.IOException;

/**
 * Created by Administrator on 2018/3/22.
 */
public class GraphDemo {
    public static void main(String[] args) throws IOException {
        CreateGraph.createGraph();
        CreateGraph.outputGraph();
        System.out.println("DFS");
        DFSGraph.DFS(CreateGraph.getG(),0);
    }
}
