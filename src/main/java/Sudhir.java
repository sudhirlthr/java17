import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sudhir {

    public static void main(String[] args) {
        String str = "accdddfyffyyyy";
        String ouput = "accdddfffyyyyy";

        String input2 = "bbaaaaazzcccyyyyyffff";
        String op2 = "abbzzcccffffyyyyy";


        Map<Character, Integer> map = new TreeMap<>();
        for (char c: input2.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else map.put(c, 1);
        }
        // sort based on value
        Stream<Map.Entry<Character, Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        LinkedHashMap<Character, Integer> collect = sorted.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        StringBuilder stringBuilder = new StringBuilder();

        collect.forEach((character, integer) -> {
            int i = integer;
            while (i > 0){
                stringBuilder.append(character);
                i--;
            }
        });

        System.out.println(stringBuilder.toString());
    }

    private Map<Character, Integer> sortMapByValue(Map<Character, Integer> map){
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<Character, Integer> characterIntegerLinkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> en: list){
            characterIntegerLinkedHashMap.put(en.getKey(), en.getValue());
        }
        return characterIntegerLinkedHashMap;
    }
    public String sortIntArray(String str){
        int[] arr = new int[128];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        StringBuilder result = new StringBuilder();
        int min = -1, index = -1;
        for (int i = 0; i < 128; i++) {
            for (int j = 0; j < 128; j++) {
                if (arr[j] !=0 && min < arr[j]) {
                    min = arr[j];
                    arr[j] = 0;
                    index = j;
                }
            }
            result.append(arr[index]);
        }
    return result.toString();
    }
    public Map<Character, Integer> sortMapByValue2( Map<Character, Integer> map){
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
