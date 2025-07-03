/*
package io.sudhir.log;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        System.out.println(solution("<><??>>"));
    }

    // Implement your solution here
    public static int solution(String S) {
        // Implement your solution here
        if(!S.contains("?")) return getLongestSymmetric(S);

        return Math.max(solution(S.replaceFirst("\\?", "<")), solution(S.replaceFirst("\\?", ">")));
    }

    private static int getLongestSymmetric(String s){
        int res = 0, i=0;
        while(i < s.length()){
            int rl = s.length()-1;
            if( res >= rl) return res;
            int l = i;
            int r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) =='<' && s.charAt(r) =='>'){
                int suublen = r-l+1;
                res = Math.max(res, suublen);
                l -= 1;
                r += 1;
            }
            i = r;
        }
        return res;
    }
}

package io.sudhir;

        import java.time.Duration;
        import java.time.LocalDateTime;
        import java.time.LocalTime;
        import java.util.HashSet;
        import java.util.LinkedHashSet;
        import java.util.Set;

public class TimeDuration {
    public static void main(String[] args) {
        // Define the start and end times
        System.out.println(solution("15:15:00", "15:15:12"));

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
        String hour = String.valueOf(time.getHour());
        String minute = String.valueOf(time.getMinute());
        String second = String.valueOf(time.getSecond());
        Set<String> set = new HashSet<>();
        for (String str: hour.split("")){
            if (!set.contains(str)){
                set.add(str);
                size++;
            }
        }

        for (String str: minute.split("")){
            if (!set.contains(str)){
                set.add(str);
                size++;
            }
        }
        if (size > 2) return false;
        for (String str: second.split("")){
            if (!set.contains(str)){
                set.add(str);
                size++;
            }
        }
        return size <= 2;
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
*/
