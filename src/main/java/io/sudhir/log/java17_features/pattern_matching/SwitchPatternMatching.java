package io.sudhir.log.java17_features.pattern_matching;

public class SwitchPatternMatching {
    public static void main(String[] args) {
        Object str = "Sudhir";
        Object number = 21;

        System.out.println("On 1990 way------");
        System.out.println(testForSwitchExpressionOldWayMoreOlder(str));
        System.out.println(testForSwitchExpressionOldWayMoreOlder(number));
        System.out.println(testForSwitchExpressionOldWayMoreOlder(null));
        System.out.println("On 2000 way-------");
        System.out.println(testForSwitchExpressionOldWay(str));
        System.out.println(testForSwitchExpressionOldWay(number));
        System.out.println(testForSwitchExpressionOldWay(null));
        System.out.println("----------- check preview feature");
        System.out.println(testForSwitchExpression(str));
        System.out.println(testForSwitchExpression(number));
        System.out.println(testForSwitchExpression(null));

        System.out.println("On switch with Guarded way------");
        System.out.println(testForSwitchExpressionOldWayMoreOlder_GuardedWay(str));
        System.out.println(testForSwitchExpressionOldWayMoreOlder_GuardedWay(number));
        System.out.println(testForSwitchExpressionOldWayMoreOlder_GuardedWay(null));
    }

    private static String testForSwitchExpressionOldWayMoreOlder(Object obj) {
        String output;
        switch (obj) {
            case null:
                output = "Its a null";
                break;
            case String s :
                if (s.length() > 0 ) output = String.format("String %s", s);
                else output = String.format("Empty String");
                break;
            case Integer i:
                output = String.format("Integer %d", i);
                break;
            case Long l:
                output = String.format("Integer %d", l);
                break;
            case Double d:
                output = String.format("Integer %f", d);
                break;
            default: output = "Defaule value";
        }
        return output;
    }

    private static String testForSwitchExpressionOldWay(Object str) {
        if (str == null) return "Its null!";
        String output = "Unknown String!";
        if (str instanceof String) {
            output = String.format("String %s", str);
        } else if (str instanceof Integer) {
            output = String.format("String %d", str);
        } else if (str instanceof Double) {
            output = String.format("String %f", str);
        } else if (str instanceof Long) {
            output = String.format("String %d", str);
        }
        return output;
    }

    private static String testForSwitchExpression(Object str) {
        return switch (str) {
            case null -> "Its a Null value!";
            case String s -> String.format("String %s", s);
            case Integer i -> String.format("String %d", i);
            case Double d -> String.format("String %f", d);
            case Long l -> String.format("String %d", l);
            default -> str.toString();
        };
    }

    private static String testForSwitchExpressionOldWayMoreOlder_GuardedWay(Object obj) {
        String output;
        switch (obj) {
            case null -> output = "Its a null value!";
            case String s -> {
                if (s.length() > 0) output = String.format("String %s", s);
                else output = "Empty String";
            }
            case Integer i -> output = String.format("Integer %d", i);
            case Long l -> output = String.format("Integer %d", l);
            case Double d -> output = String.format("Integer %f", d);
            default -> output = "Default value";
        }
        return output;
    }
}
