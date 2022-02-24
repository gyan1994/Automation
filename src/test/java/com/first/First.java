package com.first;

import cucumber.api.java.en.Given;

public class First {

    @Given("^Test giving$")
    public void test_giving() {
        System.out.println("Hello Cucumber");
    }
}
