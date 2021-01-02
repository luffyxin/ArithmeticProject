package com.dx.nowcoder.xiaozhao2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/20.
 */
public class main4_20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int []Ais=new int[M];
        List<dipi> dipis=new ArrayList<dipi>();

        for(int i=0;i<N;i++){
            dipi d=new dipi();
            d.setDi(scan.nextInt());
            d.setPi(scan.nextInt());
            dipis.add(d);
        }

        for(int j=0;j<M;j++){
            Ais[j]=scan.nextInt();
        }
            Collections.sort(dipis);

        for( int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(Ais[i]>=dipis.get(j).getDi()){
                    System.out.println(dipis.get(j).getPi());
                    break;
                }
            }
        }
    }
}
class dipi implements  Comparable<dipi>{
    int di;
    int pi;
    public dipi(){}
    public int getDi() {
        return di;
    }

    public void setDi(int di) {
        this.di = di;
    }

    public int getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public dipi(int di, int pi) {
        this.di = di;
        this.pi = pi;
    }
    @Override
    public int compareTo(dipi o) {
        return  o.pi-this.pi;
    }
}
