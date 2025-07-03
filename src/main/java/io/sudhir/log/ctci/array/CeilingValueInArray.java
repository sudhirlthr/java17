package io.sudhir.log.ctci.array;

import java.util.Set;
import java.util.TreeSet;

public class CeilingValueInArray {
    public int[] findAllCeilingValueOfGivenArrayElements(int[] arr){
         int[] res = new int[arr.length];
         res[0] = -1;
        TreeSet<Integer> set = new TreeSet<>();// self balancing BST, gives insertion and deletion log N times as TC
        set.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if ( set.ceiling(arr[i]) != null && set.contains(set.ceiling(arr[i]))) res[i] = set.ceiling(arr[i]);
            else res[i] = -1;
            set.add(arr[i]);
        }
        return res;
    }
}
