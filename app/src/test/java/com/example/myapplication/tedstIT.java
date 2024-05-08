package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class tedstIT {
    @Test
    public void integration(){
        Color red= new Red();
        assertEquals("The color Red", red.showName());
        Circle c = new Circle("Circle", 5.0);
        assertEquals((float)(3.1416*5*5), c.area(),.001);
    }
}
