package io.sudhir.log.geeks.math;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "abc";
        printAllPermutation(str, "");
    }

    private static void printAllPermutation(String str, String prefix) {
        if (str.length() == 0) System.out.println(prefix);
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0,i) + str.substring(i+1);
            printAllPermutation(rem, prefix+ str.charAt(i));
        }
        System.out.println("Current Date: "+ LocalDate.parse("2020-10-23", DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(Locale.getDefault())));
    }
}
