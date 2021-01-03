package com.dx.leecode.offer;

import java.util.LinkedList;

/**
 * 两个栈实现队列
 */
public class pro09 {

    public static void main(String[] args) {
        CQueue obj = new CQueue();

        System.out.println( obj.deleteHead());
        obj.appendTail(5);
         obj.appendTail(2);
        System.out.println( obj.deleteHead());
        System.out.println( obj.deleteHead());

    }



}

class CQueue {

    private LinkedList<Integer> list1;
    private LinkedList<Integer> list2;

    public CQueue() {
        list1 = new LinkedList<>();
        list2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        list1.push(value);
    }

    public int deleteHead() {
        int res;
        if(list1.size() == 0){
            return -1;
        }

        while (list1.size() > 1) {
            list2.push(list1.pop());

        }
        res = list1.pop();
        while (list2.size()> 0){
            list1.push(list2.pop());
        }

        return res;
    }
}
