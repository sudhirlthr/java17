package io.sudhir.log;

import java.lang.reflect.Field;

public class JunitTest {
    public String process(SK sk, TestArose test){
        String val = null;
        for(Field field: test.getClass().getDeclaredFields()){
            field.setAccessible(true);
            val = process2(sk, test, field);
        }
        return val;
    }

    private String process2(SK sk, TestArose test, Field field) {
        try {
            Object o = field.get(test);
        } catch (IllegalAccessException e) {
            throw  new RuntimeException(e);
        }
        return sk.name();
    }

}
enum SK{
    ABC, DEF
}