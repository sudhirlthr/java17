package io.sudhir.log.ctci.bst;

public class Floor_ClosestSmallerValueInBST {

    /*
    * Find value on BST where given value is nearest smaller or equal
    * */
    public TreeNode findClosestSmallestValue(TreeNode root, int val){
        TreeNode result = null;
        if (root == null) return null;
        while (root != null){
            if (root.val == val) return root;
            else if (root.val > val){
                root = root.left;
            }else {
                result = root;
                root = root.right;
            }
        }
        return result;
    }
}
