package io.sudhir.log.algorithm;

import java.util.*;

public class LRU<T> {
    private final int size;
    private final List<T> lruList;
    private final Map<T, Integer> lruMap;

    public LRU(int size) {
        this.size = size;
        lruList = new LinkedList<>();
        lruMap = new LinkedHashMap<>(size);
    }
    public boolean add(T t){
        if (lruList.contains(t)){
            // bring current element to top
            if(delete(t)){
                lruList.add(t);
            } else return false;

        } else {
            if (size > lruList.size()) lruList.add(t);
            else if(size == lruList.size()) {
                lruList.remove(0);
                lruList.add(t);
            }
            return true;
        }
        return false;
    }

    public T poll(){
        if (lruList.size() > 0){
            T t1 = lruList.get(lruList.size()-1);
            delete(t1);
            return t1;
        }
        return null;
    }

    public T peek(){
        // return top element from list
        if (lruList.size() > 0) return lruList.get(lruList.size()-1);
        else return null;
    }
    public boolean delete(T t){
        if(lruList.contains(t)){
            lruList.remove(t);
             return true;
        }
        return false;
    }

    public List<T> getAll(){
        List<T> reversedList = lruList.subList(0, lruList.size());
        Collections.reverse(reversedList);
        return reversedList;
    }
}
