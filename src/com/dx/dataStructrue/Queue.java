package com.dx.dataStructrue;

/**
 * Created by Administrator on 2018/6/12.
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
