package com.second;

import cucumber.api.java.en.Given;

public class Second {

    @Given("^Test giving$")
    public void test_giving() {
        System.out.println("Hello Cucumber 2");
    }
}
