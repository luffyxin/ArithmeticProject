package com.dx.leecode.offer;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class pro68 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((root == null) || (root == p) || (root == q)) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (right == null && left == null) return null;
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }

    public static void main(String[] args) {
         TreeNode root = new  TreeNode(3);
         TreeNode root2 = new  TreeNode(5);
         TreeNode root3 = new  TreeNode(1);
         TreeNode root4 = new  TreeNode(6);
         TreeNode root5 = new  TreeNode(2);
         TreeNode root6 = new  TreeNode(0);
         TreeNode root7 = new  TreeNode(8);
         TreeNode root8 = new  TreeNode(7);
         TreeNode root9 = new  TreeNode(4);

        root.left = root2;
        root.right = root3;
        root2.left = root4;
        root2.right = root5;
        root5.left = root8;
        root5.right = root9;
        root3.left = root6;
        root3.right = root7;
        lowestCommonAncestor(root,root8,root9);

    }

}
