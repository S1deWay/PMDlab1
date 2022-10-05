package com.example.pmd_lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Min_test_1() {
        assertEquals(MainActivity.Min(2,5),2);
    }
    @Test
    public void Min_test_2() {
        assertEquals(MainActivity.Min(2,1),1);
    }
    @Test
    public void Min_test_3() {
        assertEquals(MainActivity.Min(-1,-2),-2);
    }
    @Test
    public void Min_test_4() {
        assertEquals(MainActivity.Min(-6,-1),-6);
    }
    @Test
    public void Max_test_1() {
        assertEquals(MainActivity.Max(2,5),5);
    }
    @Test
    public void Max_test_2() {
        assertEquals(MainActivity.Max(2,1),2);
    }
    @Test
    public void Max_test_3() {
        assertEquals(MainActivity.Max(3,-5),3);
    }
    @Test
    public void Max_test_4() {
        assertEquals(MainActivity.Max(-11,-1),-1);
    }
}