package com.cydeo.tests.day09_javafaker_testbase_driverUtiility;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1(){
        //creating faker object to reach methods
        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //can do soem numbers that stay and anything # is random number
        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.letterify(\"????\") = " + faker.letterify("????"));

        System.out.println("faker.bothify(\"##??##\") = " + faker.bothify("##??##"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Muhtar\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));

    }
}
