package io.sudhir.log.map;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample<K, V> {
    // sort Map by value
    public Map<Character, Integer> sortMapByValue(Map<Character, Integer> map){
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new ));
    }
    public Map<Character, Integer> sortMapWithHelpOfList(Map<Character, Integer> map){
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry: entries){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
    public Map<Character, Integer> sortMapOnReverseOrder(Map<Character, Integer> map){
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry: list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;

    }
}
