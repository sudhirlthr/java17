package io.sudhir.log.ctci.bst;

public class Ceiling_ClosestBiggerValueBST {
    public TreeNode findClosestBiggerValue(TreeNode root, int val){
        TreeNode result = null;
        if (root == null) return null;
        while (root != null){
            if (root.val == val) return root;
            else if (root.val > val) {
                result = root;
                root = root.left;
            }else root = root.right;
        }
        return result;
    }
}
