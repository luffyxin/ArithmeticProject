package com.dx.dataStructrue;

/**
 * Created by Administrator on 2018/6/11.
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
