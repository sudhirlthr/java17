package io.sudhir.log.geeks.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstNegativeOfWindow_K_size {
    public List<Integer> findFirstNegativeElementOfSize_k_window(int[] arr, int size){
        List<Integer> list = new ArrayList<>(size);
        List<Integer> result = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < arr.length-size+1; i++) {
            int len = Math.min(i + size, arr.length);
            for (int j = i; j < len; j++) {
                list.add(arr[j]);
            }
            Optional<Integer> it = list.stream().filter(v -> v < 0).findFirst();
            if (it.isPresent()){
                result.add(it.get());
            } else   result.add(0);
            list = new ArrayList<>(size);
        }
        return result;
    }
}
