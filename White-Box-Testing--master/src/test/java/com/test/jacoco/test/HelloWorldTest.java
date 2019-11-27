package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method3(6, -1, 1);
        int b = hw.Method3(6, 0, 1);
        int c = hw.Method3(4, -1, 1);
        int d = hw.Method3(4, -1, -3);
        int e = hw.Method3(5, -1, 0);
        assertEquals(0, a);
        assertEquals(0, b);
        assertEquals(0, c);
        assertEquals(0, d);
        assertEquals(0, e);
    	
    }

    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 1, 1, 1, 1);
        int b = hw.Method4(1, 1, 1, 1, 1);
        int c = hw.Method4(5, 1, 1, 1, 1);
        assertEquals(0, a);
        assertEquals(0, b);
        assertEquals(0, c);
    }

    @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(1);
        boolean b = hw.bug(5);
        assertEquals(false, a);
        assertEquals(true, b);
    }

    @Test
    public void testisTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(1, 2, 2);
        boolean b = hw.isTriangle(4, 2, 2);
        boolean c = hw.isTriangle(2, 4, 2);
        boolean d = hw.isTriangle(2, 2, 4);
        boolean e = hw.isTriangle(1, 1, 0);
        boolean f = hw.isTriangle(1, 0, 0);
        boolean g = hw.isTriangle(0, 0, 0);
        assertEquals(true, a);
        assertEquals(false, b);
        assertEquals(false, c);
        assertEquals(false, d);
        assertEquals(false, e);
        assertEquals(false, f);
        assertEquals(false, g);
    }

    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean a1 = hw.isBirthday(1990, 1, 1);
        boolean a2 = hw.isBirthday(2019, 10, 1);
        boolean a3 = hw.isBirthday(2019, 1, 1);
        boolean b = hw.isBirthday(2019, 10, 2);
        boolean c = hw.isBirthday(2019, 11, 1);
        boolean d1 = hw.isBirthday(2000, 2, 30);
        boolean d2 = hw.isBirthday(2000, 2, 29);
        boolean d3 = hw.isBirthday(2000, 1, 1);
        boolean e1 = hw.isBirthday(1990, 2, 29);
        boolean e2 = hw.isBirthday(1990, 2, 28);
        boolean f = hw.isBirthday(1990, 4, 31);
        boolean g = hw.isBirthday(1990, 6, 31);
        boolean h = hw.isBirthday(1990, 9, 31);
        boolean i = hw.isBirthday(1990, 11, 31);
        boolean j = hw.isBirthday(1990, 1, 32);
        boolean k = hw.isBirthday(1990, 1, 0);
        boolean l = hw.isBirthday(1990, 13, 1);
        boolean m = hw.isBirthday(1990, 0, 1);
        boolean n = hw.isBirthday(2020, 1, 1);
        boolean o = hw.isBirthday(1989, 1, 1);
        assertEquals(true, a1);
        assertEquals(true, a2);
        assertEquals(true, a3);
        assertEquals(false, b);
        assertEquals(false, c);
        assertEquals(false, d1);
        assertEquals(true, d2);
        assertEquals(true, d3);
        assertEquals(false, e1);
        assertEquals(true, e2);
        assertEquals(false, f);
        assertEquals(false, g);
        assertEquals(false, h);
        assertEquals(false, i);
        assertEquals(false, j);
        assertEquals(false, k);
        assertEquals(false, l);
        assertEquals(false, m);
        assertEquals(false, n);
        assertEquals(false, o);
    }

    @Test
    public void testminiCalculator() {
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(3.0, 2.0, '+');
        double b = hw.miniCalculator(3.0, 2.0, '-');
        double c = hw.miniCalculator(3.0, 2.0, '*');
        double d = hw.miniCalculator(3.0, 2.0, '/');
        assertEquals((double)5.0, a, 0.01);
        assertEquals((double)1.0, b, 0.01);
        assertEquals((double)6.0, c, 0.01);
        assertEquals((double)1.5, d, 0.01);
    }
}
