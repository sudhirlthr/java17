package io.sudhir.log.ctci.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ceiling_ClosestBiggerValueBSTTest {

    TreeNode root = BstTreeGenerator.generateBstTree();
    Ceiling_ClosestBiggerValueBST instance = new Ceiling_ClosestBiggerValueBST();

    @Test
    void findClosestBiggerValue() {
        assertEquals(65, instance.findClosestBiggerValue(root, 63).val);
    }
    @Test
    void findClosestBiggerValue_2() {
        assertEquals(80, instance.findClosestBiggerValue(root, 75).val);
    }
    @Test
    void findClosestBiggerValue_3() {
        assertEquals(null, instance.findClosestBiggerValue(root, 85));
    }
}