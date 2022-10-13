package com.cydeo.test.day5_testing_dropdown;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {


    @Test(priority = 1)
    public void test1() {
        System.out.println("Test1 is running...");

        String actual ="apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Test2 is running...");
        String actual ="apple";
        String expected = "apple2";
        Assert.assertTrue(actual.equals(expected));


        }
        @BeforeMethod
    public void setUpMethod(){
            System.out.println("-->> Before Method is running");
        }
        @AfterMethod
    public void tearDown(){
            System.out.println("-->>After Method is running ");
        }

        }

