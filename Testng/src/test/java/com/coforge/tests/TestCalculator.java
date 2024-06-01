package com.coforge.tests;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TestCalculator {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	Calculator cal = new Calculator();
    
    @Test
    public void testAdd() {
        int sum = cal.add(a,b);
        assertEquals(8, sum);
        System.out.println("5 + 3 = " + sum);
    }
    
    @Test
    public void testSub() {
        int difference = cal.subtract(a,b);
        assertEquals(6, difference);
        System.out.println("10 - 4 = " + difference);
    }
    
    @Test
    public void testMultiple() {
        int product = cal.multiply(a,b);
        assertEquals(42, product);
        System.out.println("6 * 7 = " + product);
    }
}
