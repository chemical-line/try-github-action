package com.example.demo.tool;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConuterTest {

    @Test
    public void contOk1() {
        Counter target = new Counter();
        int[] sample = { 1, 2, 3 };
        int ans = target.countArray(sample);
        assertEquals(3, ans, "count missmatch");
    }

}
