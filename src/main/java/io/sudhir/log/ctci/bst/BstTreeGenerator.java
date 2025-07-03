package io.sudhir.log.ctci.bst;

public class BstTreeGenerator {
    public static TreeNode generateBstTree(){
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right = new TreeNode(70);
        root.right.left = new TreeNode(60);
        root.right.left.left = new TreeNode(55);
        root.right.left.right = new TreeNode(65);
        root.right.right = new TreeNode(80);
        return root;
    }
}
