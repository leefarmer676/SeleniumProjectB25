package com.cydeo.tests.day5_testNG_intro_drop;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @Test (priority = 2)//adding this made it runnable
    public void test1() {
        System.out.println("Test 1 is running...");

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual, expected);
    }

    @Test (priority = 1)
    public void test2(){
            System.out.println("Test 2 is running...");

            String actual = "apple";
            String expected = "apple";

            Assert.assertTrue(actual.equals(expected));
        }
        @BeforeClass
        public void setUpMethod(){
            System.out.println("beforeClass is running");
        }

        @AfterClass
        public void tearDownClass(){
            System.out.println("AfterClass is running");
        }

    @BeforeMethod //this will run as many times as the number of test being run
    public void setupMethod(){
        System.out.println("BeforeMethod is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("afterMethod is running");
    }


}
