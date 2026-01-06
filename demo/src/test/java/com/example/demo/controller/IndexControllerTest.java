package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class IndexControllerTest {
    @Test
    public void testWelcome() {
        IndexController controller = new IndexController();
        String[] input = {"hello", null, "world"};
        String expected = "param[0]Hello\nparam[1]null\nparam[2]world\n";
        String result = controller.welcome(input);
        assertEquals(expected, result);        
    }
}
