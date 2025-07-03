package io.sudhir;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TimeDuration {
    public static void main(String[] args) {
        // Define the start and end times
        System.out.println(solution("22:22:21", "22:22:23"));

    }
    private static int solution(String S, String T){
        String[] split = S.split(":");
        String[] t_split = T.split(":");
        LocalTime start = LocalTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        LocalTime end = LocalTime.of(Integer.parseInt(t_split[0]), Integer.parseInt(t_split[1]), Integer.parseInt(t_split[2])+1);


        // Define the duration of each interval
        Duration interval = Duration.ofSeconds(1);

        // Count interesting points
        int interestingPoints = countInterestingPoints(start, end, interval);
        System.out.println("Number of interesting points: " + interestingPoints);
        return interestingPoints;
    }

    public static int countInterestingPoints(LocalTime start, LocalTime end, Duration interval) {
        int count = 0;
        LocalTime current = start;

        // Iterate until the current time is past the end time
        while (current.isBefore(end)) {
            // Check if the current time is an "interesting point"
            if (isInterestingPoint(current)) {
                count++;
            }

            // Move to the next time interval
            current = current.plus(interval);
        }

        return count;
    }

    // Replace this with your logic to determine if a time is interesting
    private static boolean isInterestingPoint(LocalTime time) {
        // Example: Check if the time is at the top of the hour
        int count = 0, size = 0;
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        Set<String> set = new HashSet<>();
        if (minute != hour && !String.valueOf(hour).equals(new StringBuilder(String.valueOf(minute)).reverse())) size = breakTime(String.valueOf(hour));
        else {
            size = 2;
            set = new HashSet<>(Arrays.asList(String.valueOf(hour).split("")));
        }
        if(minute != second && !String.valueOf(minute).equals(new StringBuilder(String.valueOf(second)).reverse())) {
            size += breakTime(String.valueOf(second));
            for(String str: String.valueOf(second).split("")){
                if (!set.contains(str)) set.add(str);
            }
            if (size <= 3 || set.size() <= 3) return true;
        }

        if (size > 3) return false;
        size += breakTime(String.valueOf(minute));
        return size <= 3;
    }

    private static int breakTime(String time){
        if (time.length() < 2) return 2;
        Set<String> integers = new LinkedHashSet<>();
        Integer count  = 0;
        for(String str: time.split("")){
            if (integers.contains(str)) return integers.size();
            else integers.add(str);
        }
        return integers.size();
    }
}
