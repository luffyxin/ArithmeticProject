package com.dx.dataStructrue.List;


/**
 * Created by Administrator on 2018/3/21.
 * 链表
 */
public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int ListLength(ListNode headNode) {

        int sum = 0;
        ListNode currentNode = headNode;
        while (currentNode != null) {
            sum++;
            currentNode = currentNode.getNext();
        }
        return sum;
    }

    ListNode InsertInLinkedList(ListNode headNode, ListNode nodeToInsert, int position) {
        if (headNode == null) {
            return nodeToInsert;
        }
        int size = ListLength(headNode);
        if (position < 1 || position > size) {
            return headNode;
        }
        //表头插入
        if (position == 1) {
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        }
        //表中或者表尾
        else {
            ListNode currentListNode = headNode;
            int count = 1;
            while (count < position - 1) {
                currentListNode = currentListNode.getNext();
                count++;
            }
            nodeToInsert.setNext(currentListNode.getNext());
            currentListNode.setNext(nodeToInsert);

        }
        return headNode;
    }

    public void traverseList(ListNode headNode) {
        ListNode currentListNode = headNode;
        while (currentListNode != null) {
            System.out.println(currentListNode.getData());
            currentListNode = currentListNode.getNext();
        }
    }

    public static void main(String[] args) {
        ListNode headNode = new ListNode(1);
        headNode = headNode.InsertInLinkedList(headNode, new ListNode(5),headNode.ListLength(headNode));
        headNode = headNode.InsertInLinkedList(headNode, new ListNode(7), headNode.ListLength(headNode));
        headNode = headNode.InsertInLinkedList(headNode, new ListNode(1), headNode.ListLength(headNode));
        headNode = headNode.InsertInLinkedList(headNode, new ListNode(4), headNode.ListLength(headNode));
        headNode = headNode.InsertInLinkedList(headNode, new ListNode(9), headNode.ListLength(headNode));
         headNode.traverseList(headNode);
    }
}
