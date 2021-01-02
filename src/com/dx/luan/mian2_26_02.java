package com.dx.luan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
基础练习 十六进制转八进制
 */
public class mian2_26_02 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());

        String str[]=new String[n];

        for(int i=0;i<n;i++){
            str[i]=reader.readLine();
        }
        for(int i=0;i<n;i++){
            transfrom2(str[i]);
        }
    }

    public static void transfrom2(String str){
        StringBuffer str2=new StringBuffer();
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            switch (c[i]){
                case '0' : str2.append("0000");break;
                case '1' : str2.append("0001");break;
                case '2' : str2.append("0010");break;
                case '3' : str2.append("0011");break;
                case '4' : str2.append("0100");break;
                case '5' : str2.append("0101");break;
                case '6' : str2.append("0110");break;
                case '7' : str2.append("0111");break;
                case '8' : str2.append("1000");break;
                case '9' : str2.append("1001");break;
                case 'A' : str2.append("1010");break;
                case 'B' : str2.append("1011");break;
                case 'C' : str2.append("1100");break;
                case 'D' : str2.append("1101");break;
                case 'E' : str2.append("1110");break;
                case 'F' : str2.append("1111");break;
            }
        }
        transform8(str2);
    }
    public static void transform8(StringBuffer str){
        StringBuffer str8=new StringBuffer();

        int l=str.length();
        if(l%3==0){
            if(str.substring(0,3).equals("000")){
                str.delete(0,3);
            }
        }
        else if(l%3==1){
            if(str.substring(0,1).equals("0")){
                str.delete(0,1);
            }
            else {
                str.insert(0,"00");
            }
        }
        else if(l%3==2){
            if(str.substring(0,2).equals("00")){
                str.delete(0,2);
            }
            else {
                str.insert(0,"0");
            }
        }
        int n=str.length()/3;
        String str2[]=new String[n];
        for(int i=0;i<n;i++){
            str2[i]=str.substring(i*3,i*3+3);
            if(str2[i].equals("000")){
                str8.append("0");
            }
            else if(str2[i].equals("001")){
                str8.append("1");
            }
            else if(str2[i].equals("010")){
                str8.append("2");
            }
            else if(str2[i].equals("011")){
                str8.append("3");
            }
            else if(str2[i].equals("100")){
                str8.append("4");
            }
            else if(str2[i].equals("101")){
                str8.append("5");
            }
            else if(str2[i].equals("110")){
                str8.append("6");
            }
            else if(str2[i].equals("111")){
                str8.append("7");
            }
        }
        System.out.println(str8);
    }
}