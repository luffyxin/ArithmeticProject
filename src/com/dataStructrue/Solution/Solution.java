package com.dataStructrue.Solution;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2018/6/12.
 */
public class Solution {
    public boolean isVaild(String str){
        Stack<Character> stack=new Stack<>();



        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            if(str.charAt(i)=='}'){
                if(stack.peek()=='{')stack.pop();
            }
            if(str.charAt(i)==']'){
                if(stack.peek()=='[')stack.pop();
            }
            if(str.charAt(i)==')'){
                if(stack.peek()=='(')stack.pop();
            }
        }
        if(stack.isEmpty())return true;
        return false;

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String str=scan.next();

        Solution s=new Solution();
        System.out.println(s.isVaild(str));

    }
}
