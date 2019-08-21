package com.dataStructrue;

/**
 * Created by Administrator on 2018/6/2.
 */
public class Array<E> {
    private E[] data;
    private int size;

    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //在末尾位置添加元素
    public void addLast(E num) {
        add(size, num);
    }

    //在头部添加元素
    public void addFirst(E num) {
        add(0, num);
    }

    //在任意位置添加元素
    public void add(int index, E num) {

        if (index < 0 || index > size)
            throw new IllegalArgumentException("add failed .Require index>=0 and index <=size");
        if (size == data.length) {
            resize(2*data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = num;
        size++;

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size=%d , capacity=%d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) res.append(",");
        }
        res.append("]");
        return res.toString();
    }

    //获取数组中index位置的元素
    E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed.Index is illegal");
        return data[index];
    }
    //获取最后一个元素
    public E getLast(){
        return get(size-1);
    }
    //过去第一个元素
    public E getFirst(){
        return get(0);
    }

    //修改index索引位置的元素为e
    void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed.Index is illegal");
        data[index] = e;
    }

    //查询是否包含元素e
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) return true;
        }
        return false;
    }

    //查询元素e的索引
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) return i;
        }
        return -1;
    }

    //从数组中删除index位置的元素，返回删除的元素
    public E remove(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add failed .Require index>=0 and index <=size");

        E ref = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size]=null;

        if(size==data.length/4&&data.length/2!=0){
            resize(data.length/2) ;
        }
        return ref;
    }

    //从数组中删除开头的元素
    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    //从数组中删除e
    public boolean removeElement(E e) {

        int index = find(e);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }
    private void resize(int newCapacity){
        E[] newe=(E [])new Object[newCapacity];

        for(int i=0;i<size;i++){
            newe[i]=data[i];
        }
        data=newe;

    }

}





