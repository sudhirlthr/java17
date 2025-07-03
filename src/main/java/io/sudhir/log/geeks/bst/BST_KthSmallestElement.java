package io.sudhir.log.geeks.bst;

import java.util.ArrayList;
import java.util.List;

public class BST_KthSmallestElement {
    int count = 0;
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k){
        kthSmallest(root, k, 0);
        return list.get(0);
    }
    public void kthSmallest(TreeNode root, int k, int dummy){
        if (root != null){
            kthSmallest(root.left, k, dummy);
            count++;
            if (count == k) list.add(root.val);
            kthSmallest(root.right, k, dummy);
        }
    }
}
