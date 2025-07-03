package io.sudhir.log;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class MaskGivenString {

    public String maskGivenString(String rawString, List<String> listOfNoun){
        List<String> stringList = Arrays.stream(rawString.split("\\s++")).map(str -> {
            boolean match = listOfNoun.stream().anyMatch(str::equalsIgnoreCase);
            StringBuilder sb = new StringBuilder();
            if (match) {
                sb.append(str.replaceAll(str.substring(1, str.length() - 1), "*"));
                str = sb.toString();
            }
            return str;
        }).toList();
        return stringList.stream().map(str -> str+" ").collect(Collectors.joining());
    }
}
