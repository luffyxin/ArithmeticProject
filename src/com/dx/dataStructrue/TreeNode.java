package com.dx.dataStructrue;


import java.util.LinkedList;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        value = x;
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root2 = new TreeNode(5);
        TreeNode root3 = new TreeNode(1);
        TreeNode root4 = new TreeNode(6);
        TreeNode root5 = new TreeNode(2);
        TreeNode root6 = new TreeNode(0);
        TreeNode root7 = new TreeNode(8);
        TreeNode root8 = new TreeNode(7);
        TreeNode root9 = new TreeNode(4);

        root.left = root2;
        root.right = root3;
        root2.left = root4;
        root2.right = root5;
        root5.left = root8;
        root5.right = root9;
        root3.left = root6;
        root3.right = root7;




    }
}


