package com.example.demo.tool;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalcTest {

    @Test
    void addNomal1() {
        Calc c = new Calc();
        int ans = c.add(1, 2);
        assertEquals(3, ans, "add is fail");
    }

}
