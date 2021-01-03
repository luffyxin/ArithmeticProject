package com.dx.dataStructrue;

/**
 * Created by Administrator on 2018/6/12.
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(int capacity){
        array=new Array<>(capacity);
    }
    public ArrayQueue(){
        array=new Array<>();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append("Queue:");
        res.append("front [");
        for(int i=0;i<array.getSize();i++){
            res.append(array.get(i));
            if(array.getSize()-1!=i){
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
