package io.sudhir.log;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class JunitTestTest {

    @Test
    void process() {

    }

    @Test
    void process_shouldThrowException() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        JunitTest junitTest = new JunitTest();
        Method process2 = JunitTest.class.getDeclaredMethod("process2",  SK.class, TestArose.class, Field.class);
        process2.setAccessible(true);
        Field[] declaredFields = TestArose.class.getDeclaredFields();
        //io.sudhir.log.Test test = new io.sudhir.log.Test(SK.ABC, 3232l);
        //assertThrows(IllegalAccessException.class, process2.invoke(junitTest, SK.DEF, test, declaredFields[0]));
        //Assertions.assertThrows(InvocationTargetException.class, () -> process2.invoke(junitTest, SK.DEF, test, declaredFields[0]));
    }
}
