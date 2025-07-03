package io.sudhir.log.ctci.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Floor_ClosestValueInBSTTest {

    TreeNode root = BstTreeGenerator.generateBstTree();
    Floor_ClosestSmallerValueInBST instance = new Floor_ClosestSmallerValueInBST();

    @Test
    void findClosestValue() {
        assertEquals(55, instance.findClosestSmallestValue(root, 58).val);
    }
    @Test
    void findClosestValue_2() {
        assertEquals(20, instance.findClosestSmallestValue(root, 25).val);
    }
    @Test
    void findClosestValue_3() {
        assertEquals(40, instance.findClosestSmallestValue(root, 45).val);
    }
}