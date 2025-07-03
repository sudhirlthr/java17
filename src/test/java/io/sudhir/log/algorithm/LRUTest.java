package io.sudhir.log.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class LRUTest {

    LRU<String> lruInstance;
    String[] inputArray;
    String[][] expectedOutput;
    @BeforeEach
    void setUp() {
        lruInstance = new LRU<>(5);
        inputArray = new String[]{"A", "B", "C", "D", "E", "A", "E", "F"};
        expectedOutput = new String[][]{
                {"A"},
                {"A", "B"},
                {"A", "B", "C"},
                {"A", "B", "C", "D"},
                {"A", "B", "C", "D", "E"}
        };
    }

    @Order(1)
    @Test
    void poll() {
        Assertions.assertNull(lruInstance.poll());
    }

    @Order(2)
    @Test
    void peek() {
        Assertions.assertNull(lruInstance.peek());
    }

    @Order(3)
    @Test
    void delete() {
        Assertions.assertFalse(lruInstance.delete("Z"));
    }

    @Order(4)
    @Test
    void getAll() {
        Assertions.assertEquals(0, lruInstance.getAll().size());
    }

    @Order(5)
    @Test
    void add() {
        lruInstance.add("A");
        Assertions.assertEquals(1, lruInstance.getAll().size());
        Assertions.assertEquals("A", lruInstance.getAll().get(0));
        lruInstance.delete("A");
    }

    @Order(5)
    @Test
    void addMany() {
        for (int i = 0; i < 5; i++) {
            lruInstance.add(inputArray[i]);
        }
        Assertions.assertEquals(5, lruInstance.getAll().size());
        Assertions.assertArrayEquals(new String[]{"A", "B", "C", "D", "E"}, lruInstance.getAll().toArray());
        lruInstance.add("A");
        Assertions.assertArrayEquals(new String[]{"B", "C", "D", "E", "A"}, lruInstance.getAll().toArray());

    }
}