package com.cydeo.test.day10_javafaker_driver_util;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice {

    @Test
    public void java_faker_test(){

        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.music().genre() = " + faker.music().genre());
        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.numerify(\"63####-####\") = " + faker.numerify("63####-####"));
        System.out.println("faker.numerify(\"#####\") = " + faker.numerify("#####"));
        System.out.println("faker.letterify(\"???????\") = " + faker.letterify("???????"));
        System.out.println("faker.bothify(\"##???##\") = " + faker.bothify("##???##"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Lucy\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Lucy"));

    }
}
