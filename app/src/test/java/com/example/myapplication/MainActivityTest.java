package com.example.myapplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class MainActivityTest {

    @Test
    public void testCircleArea() {
        Circle c = new Circle("Circle", 5.0);
        assertEquals((float)(3.1416*5*5), c.area(), 0.01); // Use delta for floating-point comparison
    }
}
