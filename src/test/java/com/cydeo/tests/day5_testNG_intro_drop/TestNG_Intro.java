package com.cydeo.tests.day5_testNG_intro_drop;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeMethod //this will run as many times as the number of test being run
    public void setupMethod(){
        System.out.println("BeforeMethod is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("afterMethod is running");
    }


    @Test (priority = 2)//adding this made it runnable
    public void test1() {
        System.out.println("Test 1 is running...");
    }
    @Test (priority = 1)
    public void test2(){
            System.out.println("Test 2 is running...");
        }

        @BeforeClass
        public void setUpMethod(){
            System.out.println("beforeClass is running");
        }

        @AfterClass
        public void tearDownClass(){
            System.out.println("AfterClass is running");
        }


}
