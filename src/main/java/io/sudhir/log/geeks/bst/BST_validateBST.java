package io.sudhir.log.geeks.bst;

import java.util.ArrayList;
import java.util.List;

public class BST_validateBST {
    public boolean isTree_BST(TreeNode root){
        return isValid_BST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid_BST(TreeNode root, int minValue, int maxValue) {
        if (root == null) return true;
        return root.val > minValue && root.val < maxValue && isValid_BST(root.left, minValue, root.val) && isValid_BST(root.right, root.val, maxValue);
    }

    private boolean isValid_BST2(TreeNode root){
        boolean isValid = true;
        List<Integer> list = new ArrayList<>();
        if(root == null ) return true;
        else {
            inOrderTraversal(root, list);
            for (int i=0;i<list.size()-1;i++){
                if(list.get(i)>=list.get(i+1)) isValid=false;
            }
            return isValid;
        }
    }
    private void inOrderTraversal(TreeNode root, List<Integer> list){
        if(root != null){
            inOrderTraversal(root.left, list);
            list.add(root.val);
            inOrderTraversal(root.right, list);
        }
    }

    private boolean isValid(TreeNode root, Integer prev){
        if (root == null) return true;
        if (!isValid(root.left, prev)) return false;
        if (root.val <= prev) return false;
        prev = root.val;
        return isValid(root.right, prev);
    }
}
