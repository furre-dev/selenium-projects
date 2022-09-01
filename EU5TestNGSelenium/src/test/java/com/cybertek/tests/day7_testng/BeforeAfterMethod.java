package com.cybertek.tests.day7_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    @Test
    public void test(){
        System.out.println("First Test Case");
    }

    @Test
    public void test2() {
        System.out.println("Second Test Case");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Launch WebDriver");

    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Exit WebDriver");

    }


}
