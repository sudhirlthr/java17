package io.sudhir.log;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Top_K_Elements {
    public int[] getTop_K_Elements(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele: arr){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            } else map.put(ele, 1);
        }
        LinkedHashMap<Integer, Long> hashMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        final int[] count = {0};
        Map<Integer, Integer> sortedTheMap = sortTheMap(map);
        List<Integer> list = new ArrayList<>();
        sortedTheMap.forEach((integer, integer2) -> {
            if (count[0] < k){
                list.add(integer);
            }
            count[0]++;
        });
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private Map<Integer, Integer> sortTheMap(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(entries);
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> ele: entries){
            linkedHashMap.put(ele.getKey(), ele.getValue());
        }
        return linkedHashMap;
    }
}
