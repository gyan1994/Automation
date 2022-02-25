package com.first;

import cucumber.api.java.en.Given;
import org.junit.Test;

public class FirstTest {

    @Test
    @Given("^Test giving$")
    public void test_giving() {
        System.out.println("Hello Cucumber");
    }
}
