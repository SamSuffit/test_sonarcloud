package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    private final TestService testService = new TestService();

    @Test
    void test1() {
        // GIVEN
        // WHEN
        int actual = testService.test();
        // THEN
        assertEquals(2, actual);
    }
}