package com.example.demo.controller;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
import com.example.demo.controller.IndexController;
 
public class IndexControllerTest {
 
    @Test
    public void welcomeTest(){
 
        IndexController indexController = new IndexController();
        String[] paramArray = null;
        String resultadoActual = "El array esta vacio";
        String resultadoReal = indexController.welcome(paramArray);
        assertEquals(resultadoActual,resultadoReal);
    }
    @Test
    public void welcomeItemNull(){
        IndexController indexController = new IndexController();
        String[] paramArray = new String[3];
        String resultadoActual = "param[0]null\n" + "param[1]null\n" + "param[2]null\n";
        String resultadoReal = indexController.welcome(paramArray);
        assertEquals(resultadoActual, resultadoReal);
    }
    @Test
    public void welcomeItemNotNull(){
        IndexController indexController = new IndexController();
        String[] paramArray = new String[]{"Practica", "con", "JUnit"};
        String resultadoActual = "param[0]Practica\n" + "param[1]con\n" + "param[2]JUnit\n";
        String resultadoReal = indexController.welcome(paramArray);
        assertEquals(resultadoActual, resultadoReal);
    }
}