package io.sudhir.log.geeks.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BST_KthSmallestElementTest {

    TreeNode c = new TreeNode(2);
    TreeNode b = new TreeNode(1,null, c);
    TreeNode d = new TreeNode();
    TreeNode e = new TreeNode(4);

    TreeNode root = new TreeNode(3, b, e);

    BST_KthSmallestElement instance = new BST_KthSmallestElement();
    @Test
    void kthSmallest() {
        assertEquals(1, instance.kthSmallest(root, 1));
    }
    @Test
    void kthSmallest2() {
        assertEquals(1, instance.kthSmallest(root, 1));
    }
}