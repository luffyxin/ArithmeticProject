package com.nowcoder.xiaozhao2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Administrator on 2018/3/18.
 * 合唱团
 */
// TODO: 2018/3/19 牛客网2017合唱团
public class main3_18_02 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String power[]=reader.readLine().split(" ");
        String kd[]=reader.readLine().split(" ");
        int k=Integer.parseInt(kd[0]);
        int d=Integer.parseInt(kd[1]);
        List<student> sList=new ArrayList<student>();

        for(Integer i=0;i<n;i++){
            student s1=new student(Integer.parseInt(power[i]),i);
            sList.add(s1);
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(sList.get(j).getPower()>sList.get(j+1).getPower()){
                    sList.add(j,sList.get(j+1));
                    sList.remove(j+2);
                }
            }
        }
        int time=1;
        int sum=sList.get(sList.size()-1).getPower();
        for(int i=n-2;i>=0;i--){
            if(Math.abs(sList.get(i).getIndex()-sList.get(i+1).getIndex())<=d){
                sum=sum*sList.get(i).getPower();
                time++;
            }else{
                sum=sList.get(i).getPower();
                time=1;
            }
            if(time==5){
                break;
            }
        }
        System.out.println(sum);

    }

    static  class  student{
        private int power;
        private int index;

        public student(int power, int index) {
            this.power = power;
            this.index = index;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

}
